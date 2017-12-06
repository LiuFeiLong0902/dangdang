package org.tarena.dang.action.user;

import org.tarena.dang.action.BaseAction;
import org.tarena.dang.pojo.User;
import org.tarena.dang.service.UserService;
import org.tarena.dang.service.UserServiceImpl;

public class RegisterAction extends BaseAction{
	
    //input
    private User user;   
	//output

	public String execute()throws Exception{
		String ip = httpRequest.getRemoteAddr();//获得当前登录用户的ip地址
		user.setLastLoginIp(ip);// 把该ip赋值给当前user
		UserService userService = new UserServiceImpl();
	    userService.regist(user);//在service中给user赋其它值
		session.put("user",user);//session中绑定好该注册的用户
		return "verify";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
