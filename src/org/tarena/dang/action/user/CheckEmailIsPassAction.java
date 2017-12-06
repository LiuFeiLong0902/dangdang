package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.pojo.User;
import org.tarena.dang.service.UserService;
import org.tarena.dang.service.UserServiceImpl;

import com.opensymphony.xwork2.Action;
/**
 * 验证邮箱是否正确
 * @author Administrator
 *
 */

public class CheckEmailIsPassAction extends BaseAction{
	 private String code;
     private User user;
     
     private boolean ok = false;
     
	 public String execute() throws Exception{
		 user = (User) session.get("user");// 从session中获取绑定好的该注册或者是登录用户
		 String emailC = user.getEmailVerifyCode();// 获得该用户的邮箱验证码
		 String email = user.getEmail();// 获得该用户的邮箱
		//System.out.println("邮箱验证码为："+emailC+"，邮箱为："+email);
		 if(code.equals(emailC)){// 判断用户输入的邮箱验证码是否正确
			 UserService userService = new UserServiceImpl();
			 userService.findUserById(email);//根据email从数据库中查找
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
