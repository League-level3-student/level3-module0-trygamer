package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static // 1. Create a main method to test the other methods you write.
	String[] ar = { "a", "b", "c", "d", "f", "g", "h", "i", "j", "k" };

	public static void main(String[] args) {
		stringPrinter(ar);
		stringPrinterReverse(ar);
		stringPrinterEveryOther(ar);
		stringPrinterRandom(ar);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void stringPrinter(String[] sa) {
		for (int i = 0; i < sa.length; i++) {

			System.out.println(sa[i]);

		}
		System.out.println("-------");
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	public static void stringPrinterReverse(String[] sa) {
		for (int i = sa.length - 1; i >= 0; i--) {

			System.out.println(sa[i]);
		}
		System.out.println("-------");
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void stringPrinterEveryOther(String[] sa) {
		for (int i = 0; i >= sa.length; i++) {
			if (i % 2 == 0) {
				System.out.println(sa[i]);
			}
			System.out.println("-------");
		}

	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	public static void stringPrinterRandom(String[] sa) {
		Random r = new Random();
		for (int i = 0; i < sa.length; i++) {
			int sar = r.nextInt(sa.length);
			System.out.println(sa[sar]);

		}

	}
}
