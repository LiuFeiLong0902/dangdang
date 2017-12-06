package org.tarena.dang.interceptor;

import org.hibernate.Transaction;
import org.tarena.dang.util.HibernateUtil;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;
/*
 * 自定义拦截器
 */
public class TransactionInterceptor extends AbstractInterceptor implements
		Interceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("开启事务");
		Transaction tx = HibernateUtil.getSession().beginTransaction();
		try {
			// 执行Action和Result
			invocation.invoke();
			System.out.println("事务结束");
//			if(!tx.wasCommitted()){//避免重复提交main.jsp中加载recommend.jsp和new.jsp等..
//				tx.commit();
//			}
			tx.commit();
			return null;
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
            throw ex;
		} finally {
			// 释放session
			HibernateUtil.closeSession();
		}

	}

}






