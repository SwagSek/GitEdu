package service;
import java.util.Random;

public class Exercise4 {

	public static double[][] generateMatrix(int N) throws Exception {
		Random random = new Random();
		double[][] matrix = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = random.nextDouble(100 - 1) + 1;
			}
		}
		return matrix;
	}
	
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("(");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(")");
		}
	}
	
	public static double getProduct(double[][] matrix, int i, int j) throws Exception {
		double product = 0;
		for (int k = 0; k < matrix.length; k++) {
			product += matrix[k][j] * matrix[i][k];
		}
		return product;
	}
	
	public static void main(String[] args) {
		double[][] matrix = {};
		try {
			matrix = generateMatrix(6);
		} catch (Exception e) {
			System.out.println("Value for array is invalid!");
		}
		printMatrix(matrix);
		
		try {
			System.out.println(getProduct(matrix, 1, 1));
		}
		catch (Exception e){
			System.out.println("Value for dot product is invalid!");
		}
	}

}
