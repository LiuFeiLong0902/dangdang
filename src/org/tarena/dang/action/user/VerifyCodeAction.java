package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;

import com.opensymphony.xwork2.Action;

public class VerifyCodeAction extends BaseAction{
    private String checkcode;
    private boolean pass=false;//pass为true，说明验证码验证正确，为false，验证不通过
    
    public String execute(){
    	//从session中获取绑定好的验证码
    	String num = (String) session.get("validation");
    	System.out.println("从session中取得验证码是："+num);
    	System.out.println("用户输入的验证码是："+this.checkcode);
    	//拿验证码的值和用户输入的验证码进行校验
		if(num.equalsIgnoreCase(this.checkcode)){
    		this.pass=true;
    	}else{
    		this.pass=false;
    	}
    	return Action.SUCCESS;//以json方式将pass返回
    }

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}
    
}
