package ch4;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���.");
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
		}

	}

}
