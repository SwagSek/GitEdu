package service;

public class Exercise2 {

	public static int factorialForLoop(int N) {
		if (N < 0) {return 0;}
		else if (N == 0) {return 1;}
		int result = N;
		for (int i = N - 1; i >= 1; i--) {
			result = result * i;
		}
		return result;
	}

	public static int factorialRecursive (int N) {
		if (N < 0) {return 0;}
		else if (N == 0) {return 1;}
		return N * factorialRecursive(N - 1);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorialRecursive(6));
		System.out.println(factorialForLoop(6));
	}
}	
