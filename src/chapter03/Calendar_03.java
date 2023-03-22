package chapter03;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_03 {

	public static void main(String[] args) {
		
		System.out.println("년, 월, 일 입력.");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년");
        int year = scan.nextInt();
        System.out.print("월");
        int month = scan.nextInt();
        System.out.print("일");
        int day = scan.nextInt();
        
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        
        int week = cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println("****" + cal.get(Calendar.DAY_OF_WEEK));
        String[] weeks = {"", "일", "월", "화", "수", "목", "금", "토"};
        
        System.out.print(year + "년 " + month + "월 " + day + "일 은 " + weeks[week] + "요일");
        
        
		
	}

}
