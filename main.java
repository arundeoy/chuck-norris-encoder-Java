package chucknorris;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input String:");
		//System.out.print("> ");
		String string = scanner.nextLine();
		System.out.println();
		System.out.println("The result:");
		String bin = "";
		String encoded = "";

		for (int i = 0; i < string.length(); i++) {
			char a = string.charAt(i);
			bin = Integer.toBinaryString(Integer.valueOf(a));
			bin = String.format("%07d", Integer.parseInt(bin));
			//System.out.print(bin);
			encoded += bin;
		}

		bin = encoded;
		int count;

		for (int i = 0; i < bin.length(); i++) {
			char ch = bin.charAt(i);
			count = 1;

			while (i + 1 < bin.length() && bin.charAt(i) == bin.charAt(i + 1)) {
				i++;
				count++;
			}

			ch = '0';

			if (bin.charAt(i) == '1') {
				System.out.print("0" + " ");

				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}

				System.out.print(" ");
			} else {
				System.out.print("00" + " ");

				for (int j = 0; j < count; j++) {
					System.out.print(ch);
				}

				System.out.print(" ");
			}
		}

	}
}
