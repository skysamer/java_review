package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> tree;
	
	public MemberTreeSet() {
		tree=new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		tree.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=tree.iterator();
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tmpId=member.getMemberId();
			if(tmpId==memberId) {
				tree.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:tree) {
			System.out.println(member);
		}
		System.out.println();
	}

}
