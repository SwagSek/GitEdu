package service;
import java.util.Arrays;

public class Exercise7 {

	public static int factorialRecursive (int N) {
		if (N < 0) {return 0;}
		else if (N == 0) {return 1;}
		return N * factorialRecursive(N - 1);
	}	
	
	public static int[] pascalsTriangle(int level) {
		int[] currentRow = new int[level+1];
		for (int i = 0; i < level+1; i++) {
			currentRow[i] = (factorialRecursive(level)) / (factorialRecursive(i) * factorialRecursive(level-i));
		}
		return currentRow;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(pascalsTriangle(5)));
	}

}
