package org.tarena.dang.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class MD5Util {
/**
 *  ���ַ�������MD5�㷨����
 * @param str ԭ�ַ���
 * @return  ���ܺ���
 */
	public static String degist(String str)throws Exception{
		MessageDigest md = MessageDigest.getInstance("MD5");
	    byte[] bts = md.digest(str.getBytes());
	    //������֮����ַ�����bts��ת�����ַ���
	    //����Base64�㷨ת��
	    BASE64Encoder base64 = new BASE64Encoder();
	    String str1 = base64.encode(bts);
	    return str1;
    }
	public static void main(String[] args) throws Exception {
		String str = degist("test");
		System.out.println(str);
	}
	 
}
