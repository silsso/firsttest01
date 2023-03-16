package Prt_01;

import java.util.Scanner;

public class p_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		
		int tem = scan.nextInt();
		
		System.out.println("f혹은 c를 입력");
		
		String cf = scan.next();
		
		if(cf.compareToIgnoreCase("f")==0) {
            System.out.println((9.0/5.0)*tem+32);
        }else if(cf.compareToIgnoreCase("c")==0){
            System.out.println((9.0/5.0)*(tem-32));
        }
	}

}
