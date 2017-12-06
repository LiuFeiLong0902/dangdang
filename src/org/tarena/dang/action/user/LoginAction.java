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
	private String userEmail;// �û�����
	private String password;// �û�����
	private String which;// �ж��û���¼��ʱ���ǳ���ʲô�������ѵ�һ����ʶ
    // output
    public String execute() throws Exception{
    	String result="";
    	String userPwd = MD5Util.degist(password);//��������м���
    	System.out.println("�����û������ȥ�����������"+userEmail+":"+userPwd);
    	UserService userS = new UserServiceImpl();
    	
    	User user = userS.findByEmail(userEmail);//����userEmail�����ݿ��еõ���user
    	
    	if(user == null){//�ж��û��Ƿ����
    		which = "������";
    		request.put("unexisted","���䲻����");
    		return result = "unexisted";
    	}
   	
    	if(user != null){
    		session.put("user",user);// session�а󶨵�¼���û�
    		String pwd2 = user.getPassword();
    		String isEmailValid = user.getIsEmailVerify();// ��ȡ������֤��
    		System.out.println("������֤�����" + isEmailValid);
    		System.out.println("�����ݿ��еõ��û��������ǣ�"+pwd2);
    		if(!userPwd.equals(pwd2)){//���û����ڵ�ʱ�����������֤
    			 which = "��֤����";
    			 request.put("failed","������������");
    			 return result= "failed";  			 
        	}
    		
    		if (isEmailValid.equals("Y")) {// ��������֤
    			CartService cart = CartFactory.getInstance(session);
        		double d = cart.cost();
        		if(d!=0){
        			return result="cartList";
        		}
    			return result ="success";
    		}
    		if (isEmailValid.equals("N")) {//����δ��֤
    			return result = "backToEmailValid";//����δ��֤�Ļ������ص�������֤ҳ��
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
