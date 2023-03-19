package chapter02;

import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("번호 입력");

		int num = scan.nextInt();

		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");

			}

			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();

		}

	}

}
