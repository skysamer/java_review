package ch9;

public class MathEx1 {

	public static void main(String[] args) {
		double val=90.7552;
		System.out.printf("round(%f)= %d%n", val, Math.round(val));
		
		val*=100;
		System.out.printf("round(%f)= %d%n", val, Math.round(val));
		
		System.out.printf("round(%f)/100= %d%n", val, Math.round(val)/100);
		System.out.printf("round(%f)/100.0= %f%n", val, Math.round(val)/100.0);

	}

}
