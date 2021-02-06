package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arr=new ArrayList<String>();
	
	public void enQueue(String data) {
		arr.add(data);
	}
	
	public String deQueue() {
		int len=arr.size();
		if(len==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return arr.remove(0);
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}
