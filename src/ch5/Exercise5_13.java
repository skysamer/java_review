package ch5;

import java.util.Scanner;

public class Exercise5_13 {

	public static void main(String[] args) {
		String words[]= {"television", "computer", "mouse", "phone"};
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question=words[i].toCharArray();
			
			for(int k=0; k<question.length; k++) {
				int j=(int)(Math.random()*question.length);
				char tmp=question[i];
				question[i]=question[j];
				question[j]=tmp;
			}
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));
			
			String answer=sc.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.println("�����Դϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
		}

	}

}
