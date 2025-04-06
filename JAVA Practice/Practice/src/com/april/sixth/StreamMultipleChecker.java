package com.april.sixth;

import java.io.BufferedInputStream;
import java.util.stream.IntStream;

public class StreamMultipleChecker {

	public static void main(String[] args) {
		int[] numbers = {10,15,23,30};
		int divisor = 5;
		System.out.println("Multiple of"+ divisor+":");
		IntStream.of(numbers).filter(n -> n%divisor ==0).forEach(System.out::println);
	}

}
