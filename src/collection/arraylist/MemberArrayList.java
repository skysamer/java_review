package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> list;
	
	public MemberArrayList() {
		list=new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=list.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				list.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member:list) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {
		list.add(index, member);
	}

}
