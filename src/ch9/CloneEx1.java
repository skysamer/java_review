package ch9;

class Point implements Cloneable{
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		}catch (CloneNotSupportedException e) {}  //clone은 반드시 예외처리
		
		return obj;
	}
}

public class CloneEx1 {
	public static void main(String[] args) {
		Point original=new Point(3, 5);
		Point copy=(Point)original.clone();
		System.out.println(original);
		System.out.println(copy);

	}

}
