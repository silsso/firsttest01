package chapter03;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook_05 {

	public static void main(String[] args) {

		HashMap<String, String> pb = new HashMap<>();
		
		pb.put("홍길동", "010-1234-5678");
		pb.put("김미현", "010-3675-8754");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 검색 : ");
		
		String name = scan.nextLine();
		
		if(pb.containsKey(name)) {
			String pn = pb.get(name);
			System.out.println("입력하신 " + name + "의 전화번호는 " + pn);
		}else {
			System.out.println("없는 정보");
		}
		
	}

}
