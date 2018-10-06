package exercise;

import lib.Input;

public class Pass09_3 {

	public static void main(String[] args) {
		int i;
		do {
			System.out.println(Math.random());
			i = Input.getInt();
		} while (i != 0);
	}

}
