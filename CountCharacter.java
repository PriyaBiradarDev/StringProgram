package com.string.nt;

//program to count character from given String

public class CountCharacter {

	public static void main(String[] args) {

		String s1 = "priya is";

		char[] ch = s1.toCharArray();
		/*
		 * [0]=p [1]=r [2]=i
		 */

		System.out.println(ch);
		Test t1 = new Test();
		t1.countChar(s1);

	}

}

class Test {

	public void countChar(String s1) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			count++;

			// NOTE= space will be considered (+1) in count

		}
		System.out.println(count); // 8

	}

}
