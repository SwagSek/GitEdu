package service;

public class Exercise1 {

	public static void main(String[] args) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		finalPosition = 0.5 * Math.pow(gravity * fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
		
		System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
	}

}
