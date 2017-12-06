package org.tarena.dang.util;

import java.util.UUID;

public class UUIDUtil {
    public static String generator(){
    	UUID uuid = UUID.randomUUID();
    	return uuid.toString();
    }
    public static void main(String[] args){
    	System.out.println(generator());
    	System.out.println(generator());
    	System.out.println(generator());
    }
}
