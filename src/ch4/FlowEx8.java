package ch4;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("주민번호 입력.>>");
		Scanner sc=new Scanner(System.in);
		String regNo=sc.nextLine();
		
		char gender=regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			System.out.println("남성");
			break;
		case '2': case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("유효하지 않은 주민번호.");
		}

	}

}
