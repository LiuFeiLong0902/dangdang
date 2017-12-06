package org.tarena.dang.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class MD5Util {
/**
 *  将字符串采用MD5算法加密
 * @param str 原字符串
 * @return  加密后结果
 */
	public static String degist(String str)throws Exception{
		MessageDigest md = MessageDigest.getInstance("MD5");
	    byte[] bts = md.digest(str.getBytes());
	    //将加密之后的字符数组bts，转换成字符串
	    //采用Base64算法转换
	    BASE64Encoder base64 = new BASE64Encoder();
	    String str1 = base64.encode(bts);
	    return str1;
    }
	public static void main(String[] args) throws Exception {
		String str = degist("test");
		System.out.println(str);
	}
	 
}
