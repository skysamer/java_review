package ch11;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		int[] arr= {0, 1, 2, 3, 4};
		int[][] arr2D= {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("arr2D= "+Arrays.deepToString(arr2D));
		

	}

}
