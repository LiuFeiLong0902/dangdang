package org.tarena.dang.interceptor;

import org.hibernate.Transaction;
import org.tarena.dang.util.HibernateUtil;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;
/*
 * �Զ���������
 */
public class TransactionInterceptor extends AbstractInterceptor implements
		Interceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("��������");
		Transaction tx = HibernateUtil.getSession().beginTransaction();
		try {
			// ִ��Action��Result
			invocation.invoke();
			System.out.println("�������");
//			if(!tx.wasCommitted()){//�����ظ��ύmain.jsp�м���recommend.jsp��new.jsp��..
//				tx.commit();
//			}
			tx.commit();
			return null;
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
            throw ex;
		} finally {
			// �ͷ�session
			HibernateUtil.closeSession();
		}

	}

}






