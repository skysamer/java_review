package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hash;
	
	public MemberHashMap() {
		hash=new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hash.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hash.containsKey(memberId)) {
			hash.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hash.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hash.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}
