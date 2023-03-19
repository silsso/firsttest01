package chapter02;

import java.util.Scanner;

public class dollor_05 { // 단리 복리 개념 생각해보기

	public static void main(String[] args) {
		
		System.out.println("년 수 입력");
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		int money = 1000000;
        double rate = 0.045;

        for (int i = 1; i <= year; i++) {
            int total = (int) Math.round(money * (1 + rate * i));
            int save = (int) Math.round(money * rate * i);
            System.out.println(i + "년차 예치 금액 : " + total + "원, 단리이자: " + save + "원");
            
        }
    }
}