package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.pojo.User;
import org.tarena.dang.service.UserService;
import org.tarena.dang.service.UserServiceImpl;

import com.opensymphony.xwork2.Action;
/**
 * ��֤�����Ƿ���ȷ
 * @author Administrator
 *
 */

public class CheckEmailIsPassAction extends BaseAction{
	 private String code;
     private User user;
     
     private boolean ok = false;
     
	 public String execute() throws Exception{
		 user = (User) session.get("user");// ��session�л�ȡ�󶨺õĸ�ע������ǵ�¼�û�
		 String emailC = user.getEmailVerifyCode();// ��ø��û���������֤��
		 String email = user.getEmail();// ��ø��û�������
		//System.out.println("������֤��Ϊ��"+emailC+"������Ϊ��"+email);
		 if(code.equals(emailC)){// �ж��û������������֤���Ƿ���ȷ
			 UserService userService = new UserServiceImpl();
			 userService.findUserById(email);//����email�����ݿ��в���
			 this.ok = true;
		 }
		 return Action.SUCCESS; 		 
	 }
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
 
}
