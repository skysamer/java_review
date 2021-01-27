package ch5;

import java.util.Scanner;

public class MultiArr4 {

	public static void main(String[] args) {
		String[][] words= {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"},
		};
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp=sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다.");
				count++;
			}
			else {
				System.out.printf("틀렸습니다. 정답은%s입니다.%n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %d문제중 %d문제 맞혔습니다.", words.length, count);

	}

}
