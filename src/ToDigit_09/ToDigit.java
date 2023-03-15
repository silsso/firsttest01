package ToDigit_09;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 하나 입력");
		
		int num = scan.nextInt();
		
		System.out.printf("8진수 : " + "%o",num);
		System.out.printf("\n10진수 : " + num);
		System.out.printf("\n16진수 : " + "%x",num);
	}

}
