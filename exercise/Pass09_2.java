package exercise;

import lib.Input;

public class Pass09_2 {

	public static void main(String[] args) {
		double x;
		int kensu = 0;
		double total = 0;
		while ((x = Input.getDouble()) != 0) {
			total += x;
			kensu++;
		}
		System.out.println("合計= " + total);
		System.out.println("件数=" + kensu);
		System.out.println("平均=" + total / kensu);

	}

}
