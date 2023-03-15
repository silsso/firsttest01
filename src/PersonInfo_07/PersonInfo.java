package PersonInfo_07;

import java.util.Scanner;

public class PersonInfo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 몸무게 입력");
		
		int height = scan.nextInt();
		int weight = scan.nextInt();
		
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		
	}

}
