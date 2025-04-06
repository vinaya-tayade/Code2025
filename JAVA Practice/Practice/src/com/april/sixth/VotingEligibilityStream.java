package com.april.sixth;

import java.util.Arrays;
import java.util.List;

public class VotingEligibilityStream {

	public static void main(String[] args) {
		List<Integer> ages = Arrays.asList(16, 18, 25, 12);
		ages.stream()
        .forEach(age -> {
            String result = age >= 18 ? "eligible ✅" : "not eligible ❌";
            System.out.println("Age " + age + " is " + result + " to vote.");
        });
		
		

	}

}
