package ifPractice01;

import java.util.Scanner;

public class ifPractice_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("년도를 입력하세요");

		int year = scan.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
			{
			}
		}
	}
}
