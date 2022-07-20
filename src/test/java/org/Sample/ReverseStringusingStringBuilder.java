package org.Sample;

public class ReverseStringusingStringBuilder {

	public static void main(String[] args) {

		String str = "Sudha";
		String rev="";
		int len =str.length();

		for (int i =len-1; i >=0; i--) {

			char q = str.charAt(i);

			rev = rev + q;

		}

		System.out.println(rev);

	}

}
