package com.april.seventh;
import java.util.function.IntPredicate;
import java.util.Scanner;
public class OddEvenWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate isEven = num -> num%2 ==0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=scanner.nextInt();
		if(isEven.test(no)) {
			System.out.println(no+" is Even.");
			
		}else {
			System.out.println(no+" is Odd.");
		}
	}

}
