package ch9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9_14 {
	public static void main(String[] args) {
		String[] phoneNumArr= {
				"010-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input=sc.nextLine().trim();
			
			if(input.equals("")) {
				continue;
			}
			else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			String pattern=".*"+input+".*";   // 정규식 패턴 정의
			Pattern p=Pattern.compile(pattern);  //패턴을 참조변수에 저장
			
			for(int i=0; i<phoneNumArr.length; i++) {
				String phoneNum=phoneNumArr[i];
				String tmp=phoneNum.replace("-", "");  
				
				Matcher m=p.matcher(tmp);   // 배열의 전화번호와 정규식 패턴이 일치하는지 확인
				
				if(m.find()) {             // 일치하면 리스트에 저
					list.add(phoneNum);
				}
			}
			
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			}
			else {
				System.out.println("일치하는 번호가 없습니다.");
			}
			
		}

	}

}
