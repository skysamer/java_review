package ch9;

public class Exercise9_12 {
	public static int getRand(int from, int to) {
		int result=(int)(Math.random()*(int)(Math.abs(from-to)+1));
		int x=(int)(Math.min(from, to));
		result+=x;
			
		return result;
	}

	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			System.out.print(getRand(1, -3)+", ");
		}

	}

}
