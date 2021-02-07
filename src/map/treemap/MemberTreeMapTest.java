package map.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap treeMap=new MemberTreeMap();
		
		Member park=new Member(1003, "¹Ú¼­ÈÍ");
		Member lee=new Member(1001, "ÀÌÁö¿ø");
		Member hong=new Member(1004, "È«±æµ¿");
		Member son=new Member(1002, "¼Õ¹Î±¹");
		
		treeMap.addMember(park);
		treeMap.addMember(lee);
		treeMap.addMember(hong);
		treeMap.addMember(son);
		
		treeMap.showAllMember();
		
		treeMap.removeMember(1004);
		treeMap.showAllMember();

	}

}
