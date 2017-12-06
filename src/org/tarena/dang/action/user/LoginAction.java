package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.pojo.User;
import org.tarena.dang.service.CartFactory;
import org.tarena.dang.service.CartService;
import org.tarena.dang.service.UserService;
import org.tarena.dang.service.UserServiceImpl;
import org.tarena.dang.util.MD5Util;


public class LoginAction extends BaseAction{
    // input
	private User user;
	//	
	private String userEmail;// 用户邮箱
	private String password;// 用户密码
	private String which;// 判断用户登录的时候是出现什么错误提醒的一个标识
    // output
    public String execute() throws Exception{
    	String result="";
    	String userPwd = MD5Util.degist(password);//对密码进行加密
    	System.out.println("这是用户输入进去的邮箱和密码"+userEmail+":"+userPwd);
    	UserService userS = new UserServiceImpl();
    	
    	User user = userS.findByEmail(userEmail);//根据userEmail从数据库中得到该user
    	
    	if(user == null){//判断用户是否存在
    		which = "不存在";
    		request.put("unexisted","邮箱不存在");
    		return result = "unexisted";
    	}
   	
    	if(user != null){
    		session.put("user",user);// session中绑定登录该用户
    		String pwd2 = user.getPassword();
    		String isEmailValid = user.getIsEmailVerify();// 获取邮箱验证码
    		System.out.println("邮箱验证结果：" + isEmailValid);
    		System.out.println("从数据库中得到用户的密码是："+pwd2);
    		if(!userPwd.equals(pwd2)){//当用户存在的时候继续密码验证
    			 which = "验证出错";
    			 request.put("failed","邮箱或密码错误");
    			 return result= "failed";  			 
        	}
    		
    		if (isEmailValid.equals("Y")) {// 邮箱已验证
    			CartService cart = CartFactory.getInstance(session);
        		double d = cart.cost();
        		if(d!=0){
        			return result="cartList";
        		}
    			return result ="success";
    		}
    		if (isEmailValid.equals("N")) {//邮箱未验证
    			return result = "backToEmailValid";//邮箱未验证的话，返回到邮箱验证页面
    	    }
    		
         }
    	
		return result;
    	
    } 
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String getWhich() {
		return which;
	}
	public void setWhich(String which) {
		this.which = which;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
