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
			
			String pattern=".*"+input+".*";   // ���Խ� ���� ����
			Pattern p=Pattern.compile(pattern);  //������ ���������� ����
			
			for(int i=0; i<phoneNumArr.length; i++) {
				String phoneNum=phoneNumArr[i];
				String tmp=phoneNum.replace("-", "");  
				
				Matcher m=p.matcher(tmp);   // �迭�� ��ȭ��ȣ�� ���Խ� ������ ��ġ�ϴ��� Ȯ��
				
				if(m.find()) {             // ��ġ�ϸ� ����Ʈ�� ��
					list.add(phoneNum);
				}
			}
			
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			}
			else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
			
		}

	}

}
