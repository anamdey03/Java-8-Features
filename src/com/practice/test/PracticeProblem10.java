package com.practice.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public static PerformOperation isOdd() {
		return (int i) -> i % 2 != 0;
	}
	
	public static PerformOperation isPrime() {
		return (int i) -> BigInteger.valueOf(i).isProbablePrime(1);
	}
	
	public static PerformOperation isPalindrome() {
		return (int i) -> Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString());
	}

}

public class PracticeProblem10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = MyMath.isOdd();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = MyMath.isPrime();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = MyMath.isPalindrome();
				ret = MyMath.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
