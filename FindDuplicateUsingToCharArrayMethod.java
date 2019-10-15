package com.string.nt;

public class FindDuplicateUsingToCharArrayMethod {
	public static void main(String[] args) {
		String str = "priya  riya kk ypyy";
		String s1 = "";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					s1 = s1 + ch[i];
				}
			}

		}
		System.out.println(s1);

	}
}
//output==priyyyya     yyy kyyy