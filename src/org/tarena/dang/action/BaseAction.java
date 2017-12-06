package org.tarena.dang.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class BaseAction implements ServletRequestAware,SessionAware,RequestAware,ApplicationAware{
    public Map<String,Object> request;
    public HttpServletRequest httpRequest;
    public Map<String,Object> session;
    public Map<String,Object> application;
    
	public void setServletRequest(HttpServletRequest httpRequest) {
		// TODO Auto-generated method stub
		this.httpRequest=httpRequest;
	}

	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application=application;
	}
    
}
