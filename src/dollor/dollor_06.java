package dollor;

import java.util.Scanner;

public class dollor_06 {

	public static void main(String[] args) {
		System.out.println("천만 이하의 숫자를 입력");

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		String[] han = { "", "십 ", "백 ", "천 ", "만 " };

		int j = 4;

		for (int i = 10000; i > 0;) {
			if (num / i > 0) {
				System.out.print(num / i + han[j]);
				num %= i;
			}
			i /= 10;
			j -= 1;
		}
	}
}
