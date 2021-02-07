package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap hashMap=new MemberHashMap();
		
		Member lee=new Member(1001, "������");
		Member son=new Member(1002, "�չα�");
		Member park=new Member(1003, "�ڼ���");
		Member hong=new Member(1004, "ȫ�浿");
		
		hashMap.addMember(lee);
		hashMap.addMember(son);
		hashMap.addMember(park);
		hashMap.addMember(hong);
		
		hashMap.showAllMember();
		
		hashMap.removeMember(1004);
		hashMap.showAllMember();

	}

}
