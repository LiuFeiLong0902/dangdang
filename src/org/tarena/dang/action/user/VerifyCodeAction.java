package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;

import com.opensymphony.xwork2.Action;

public class VerifyCodeAction extends BaseAction{
    private String checkcode;
    private boolean pass=false;//passΪtrue��˵����֤����֤��ȷ��Ϊfalse����֤��ͨ��
    
    public String execute(){
    	//��session�л�ȡ�󶨺õ���֤��
    	String num = (String) session.get("validation");
    	System.out.println("��session��ȡ����֤���ǣ�"+num);
    	System.out.println("�û��������֤���ǣ�"+this.checkcode);
    	//����֤���ֵ���û��������֤�����У��
		if(num.equalsIgnoreCase(this.checkcode)){
    		this.pass=true;
    	}else{
    		this.pass=false;
    	}
    	return Action.SUCCESS;//��json��ʽ��pass����
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
