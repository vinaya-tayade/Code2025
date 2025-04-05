package com.april.fifth;

public class DigitCount {
public static void main(String[] args) {
	int i=12345;
	int count=0;
	int n=Math.abs(i);
	if(n==0) {
		count=1;
		
	}else {
		while(n>0) {
			n=n/10;
			count++;
		}
	}
	System.out.println("Number of digits: "+count);
}
}
