package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet tree=new MemberTreeSet();
		
		Member park=new Member(1003, "�ڼ���");
		Member lee=new Member(1001, "������");
		Member son=new Member(1002, "�չα�");
		
		tree.addMember(lee);
		tree.addMember(son);
		tree.addMember(park);
		tree.showAllMember();
		
		Member hong=new Member(1003, "ȫ�浿");
		tree.addMember(hong);
		tree.showAllMember();

	}

}
