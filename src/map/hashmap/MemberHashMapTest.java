package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap hashMap=new MemberHashMap();
		
		Member lee=new Member(1001, "ÀÌÁö¿ø");
		Member son=new Member(1002, "¼Õ¹Î±¹");
		Member park=new Member(1003, "¹Ú¼­ÈÍ");
		Member hong=new Member(1004, "È«±æµ¿");
		
		hashMap.addMember(lee);
		hashMap.addMember(son);
		hashMap.addMember(park);
		hashMap.addMember(hong);
		
		hashMap.showAllMember();
		
		hashMap.removeMember(1004);
		hashMap.showAllMember();

	}

}
