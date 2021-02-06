package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member lee=new Member(1001, "������");
		Member son=new Member(1002, "�չα�");
		Member park=new Member(1003, "�ڼ���");
		Member hong=new Member(1004, "ȫ�浿");
		Member you=new Member(1005, "����ȯ");
		
		memberArrayList.addMember(lee);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(hong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(hong.getMemberId());
		memberArrayList.showAllMember();
		memberArrayList.insertMember(you, 2);
		memberArrayList.showAllMember();

	}

}
