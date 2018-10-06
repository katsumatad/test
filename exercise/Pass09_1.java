package exercise;

import lib.Input;

public class Pass09_1 {

	public static void main(String[] args) {
		String a;
		while ((a = Input.getString()) != null) {
			System.out.println("<" + a.length() + ">" + a);
		}

	}

}
