package service;
import java.util.Arrays;
import java.util.Random;

public class Exercise3 {

	public static double[] generateArray(int N, double lower, double upper) {
		if (lower > upper) {return new double[] {};}
		Random random = new Random();
		double[] array = new double[N];
		for (int i = 0; i < N; i++) {
			array[i] = random.nextDouble(upper - lower) + lower;
		}
		return array;
		
	}
	
	public static double getMin(double[] array) {
		double currentMin = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < currentMin) {currentMin = array[i];}
		}
		return currentMin;
	}
	
	public static double getMax(double[] array) {
		double currentMax = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > currentMax) {currentMax = array[i];}
		}
		return currentMax;
	}
	
	public static double getMean(double[] array) {
		double sum = 0;
		for(double temp : array) {
			sum += temp;
		}
		return sum/array.length;
	}
	
	public static double[] arraySort(double[] array) {
		double tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		double[] arr = generateArray(6, 1, 5);
		System.out.println(Arrays.toString(arr));
		System.out.println(getMin(arr));
		System.out.println(getMax(arr));
		System.out.println(getMean(arr));
		arr = arraySort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
