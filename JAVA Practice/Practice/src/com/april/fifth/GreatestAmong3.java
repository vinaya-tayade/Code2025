package com.april.fifth;

public class GreatestAmong3 {
public static void main(String[] args) {
	int a=25;
	int b=40;
	int c=30;
	System.out.println("The nos are:" +a+","+b+","+c);
	int greatest = Math.max(a, Math.max(b, c));
	System.out.println("Greatest is: "+greatest);
}
}
