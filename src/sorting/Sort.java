package sorting;

public interface Sort {
	void ascnding(int[] arr);
	void descending(int[] arr);
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}

}
