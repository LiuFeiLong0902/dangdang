package org.tarena.dang.interceptor;

import org.tarena.dang.pojo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor  extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ac = ActionContext.getContext();
		User user = (User) ac.getSession().get("user");
		if(user==null){
			return "login";
		}
		invocation.invoke();
		
		return null;
	}
	
}
