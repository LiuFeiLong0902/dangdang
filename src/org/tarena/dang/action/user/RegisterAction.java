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
		String ip = httpRequest.getRemoteAddr();//��õ�ǰ��¼�û���ip��ַ
		user.setLastLoginIp(ip);// �Ѹ�ip��ֵ����ǰuser
		UserService userService = new UserServiceImpl();
	    userService.regist(user);//��service�и�user������ֵ
		session.put("user",user);//session�а󶨺ø�ע����û�
		return "verify";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
