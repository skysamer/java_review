package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ� �Է�");
		
		Scanner sc=new Scanner(System.in);
		int user=sc.nextInt();
		int com=(int)(Math.random()*3)+1;
		
		System.out.printf("����� %d�Դϴ�.", user);
		System.out.printf("���� %d�Դϴ�.", com);
		
		switch (user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}
	}

}
