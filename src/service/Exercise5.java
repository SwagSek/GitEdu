package service;
import java.util.Random;
import java.util.Arrays;

public class Exercise5 {
	
	public static double[] coinFlip(int N) {
		Random random = new Random();
		int currentRoll = 0;
		int headsCount = 0;
		int tailsCount = 0;
		
		for(int i = 0; i < N; i++) {
			currentRoll = random.nextInt(2);
			if (currentRoll == 1) {
				tailsCount++;
			}
			else headsCount++;
		}
		return new double [] {headsCount, tailsCount, (double)headsCount/tailsCount};
	}
	
	public static int[] rollDice(int N) {
		Random random = new Random();
		int currentRoll = 0;
		
		int oneCount = 0; int twoCount = 0; int threeCount = 0; 
		int fourCount = 0; int fiveCount = 0; int sixCount = 0;
		
		for(int i = 0; i < N; i++) {
			currentRoll = random.nextInt(6) + 1;
			switch(currentRoll) {
			case 6:
				sixCount++;
				break;
			case 5:
				fiveCount++;
				break;
			case 4:
				fourCount++;
				break;
			case 3:
				threeCount++;
				break;
			case 2:
				twoCount++;
				break;
			case 1:
				oneCount++;
				break;
			}
		}
		return new int[] {oneCount, twoCount, threeCount, fourCount, fiveCount, sixCount};
	}
	
	public static int roll2Dices() {
		int tries = 0;
		int diceRollOne = 0;
		int diceRollTwo = 0;
		Random random = new Random();
		while(true) {
			diceRollOne = random.nextInt(6) + 1;
			diceRollTwo = random.nextInt(6) + 1;
			tries++;
			if (diceRollOne == diceRollTwo) break;
		}
		return tries;
	}
	
	public static void main (String[] args) {
		System.out.println(Arrays.toString(coinFlip(10)));
		System.out.println(Arrays.toString(coinFlip(100)));
		System.out.println(Arrays.toString(coinFlip(1000)));
		System.out.println(Arrays.toString(coinFlip(10000)));
		
		System.out.println(Arrays.toString(rollDice(10000)));
		
		System.out.println(roll2Dices());
	}
}
