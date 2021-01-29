package ch9;

public class Exercise9_8 {
	public static double round(double d, int n) {
		int x=(int)(Math.pow(10, n));
		d*=x;
		double result=(double)(Math.round(d));
		result/=x;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));

	}

}
