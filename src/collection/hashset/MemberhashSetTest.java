package collection.hashset;

import collection.Member;

public class MemberhashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet=new MemberHashSet();
		
		Member lee=new Member(1001, "������");
		Member son=new Member(1002, "�չα�");
		Member park=new Member(1003, "�ڼ���");
		
		hashSet.addMember(lee);
		hashSet.addMember(son);
		hashSet.addMember(park);
		hashSet.showAllMember();
		
		Member hong=new Member(1003, "ȫ�浿");
		hashSet.addMember(hong);
		hashSet.showAllMember();

	}

}
