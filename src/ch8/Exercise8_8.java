package ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			
			try {
				input=new Scanner(System.in).nextInt();
			}catch (InputMismatchException ie) {
				System.out.println("��ȿ���� ���� ���Դϴ�.");
				continue;
			}
			
			if(answer>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer<input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("����");
				System.out.printf("�õ�Ƚ���� %d���Դϴ�.", count);
				break;
			}
		}while(true);

	}

}
