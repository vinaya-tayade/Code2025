package com.april.sixth;

import java.util.regex.Pattern;

public class MobileValidator {

	public static void main(String[] args) {
		String mobile ="9922547892";
		if(isValidMobile(mobile)) {
			System.out.println(mobile+" is valid mobile no. ✅");
		}else {
			System.out.println(mobile+" is not valid mobile no. ❌");
		}
	}

	private static boolean isValidMobile(String mobile) {
		String regx ="^[6-9]\\d{9}$";
		return Pattern.matches(regx, mobile);
	}

}
