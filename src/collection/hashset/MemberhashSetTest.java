package collection.hashset;

import collection.Member;

public class MemberhashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet=new MemberHashSet();
		
		Member lee=new Member(1001, "ÀÌÁö¿ø");
		Member son=new Member(1002, "¼Õ¹Î±¹");
		Member park=new Member(1003, "¹Ú¼­ÈÍ");
		
		hashSet.addMember(lee);
		hashSet.addMember(son);
		hashSet.addMember(park);
		hashSet.showAllMember();
		
		Member hong=new Member(1003, "È«±æµ¿");
		hashSet.addMember(hong);
		hashSet.showAllMember();

	}

}
