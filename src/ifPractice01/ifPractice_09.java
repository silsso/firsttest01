package ifPractice01;

import java.util.Scanner;

public class ifPractice_09 {

	public static void main(String[] args) {
		System.out.println("키를 입력하세요.");

		Scanner scan = new Scanner(System.in);

		int height = scan.nextInt();
		
		System.out.println("몸무게를 입력하세요.");
		
		int weight = scan.nextInt();
		
		if(weight <= (height - 100) * 0.9 ) {
			System.out.println("정상");
		}else {
			System.out.println("비만");
		}

	}
}
