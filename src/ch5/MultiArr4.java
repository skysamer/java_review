package ch5;

import java.util.Scanner;

public class MultiArr4 {

	public static void main(String[] args) {
		String[][] words= {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"},
		};
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp=sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
				count++;
			}
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������%s�Դϴ�.%n", words[i][1]);
			}
		}
		
		System.out.printf("��ü %d������ %d���� �������ϴ�.", words.length, count);

	}

}
