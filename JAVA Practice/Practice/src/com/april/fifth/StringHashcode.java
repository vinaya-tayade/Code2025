package com.april.fifth;

public class StringHashcode {
public static void main(String[] args) {
	String str1 = new String("Hello");
	String str2 = new String("Hello");
	System.out.println("str1: "+ str1);
	System.out.println("str2: "+ str2);
	System.out.println("Hashcode of str1: " + Integer.toHexString(System.identityHashCode(str1)));
	System.out.println("Hashcode of str1: " + Integer.toHexString(System.identityHashCode(str2)));
}
}
