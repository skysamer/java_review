package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet tree=new MemberTreeSet();
		
		Member park=new Member(1003, "¹Ú¼­ÈÍ");
		Member lee=new Member(1001, "ÀÌÁö¿ø");
		Member son=new Member(1002, "¼Õ¹Î±¹");
		
		tree.addMember(lee);
		tree.addMember(son);
		tree.addMember(park);
		tree.showAllMember();
		
		Member hong=new Member(1003, "È«±æµ¿");
		tree.addMember(hong);
		tree.showAllMember();

	}

}
