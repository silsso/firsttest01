package dollor;

import java.util.Scanner;

public class dollor_10 {

	public static void main(String[] args) { // 오류 발생 수정사항 질문!!
		System.out.println("금액을 천원 이상입력");

		Scanner scan = new Scanner(System.in);

		int pay = scan.nextInt();

		String[] bill = { "1000원권 ", "5000원권 ", "10000원권 ", "50000원권 " };

		int j = 3;

		for (int i = 50000; i > 0;) {
			if (pay / i > 0) {
				System.out.print(bill[j] + pay / i + "개 ");
				pay %= i;
			}
			if (pay > 10000 || pay < 5000) {
				i /= 5;
			} else if (pay < 10000 && pay > 5000) {
				i /= 2;
			} 
			j -= 1;
		}
	}
}
