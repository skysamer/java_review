package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.*;

public class MemberHashSet {
	private HashSet<Member> hash;
	
	public MemberHashSet() {
		hash=new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hash.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=hash.iterator();
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tmpId=member.getMemberId();
			if(tmpId==memberId) {
				hash.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:hash) {
			System.out.println(member);
		}
		System.out.println();
	}

}
