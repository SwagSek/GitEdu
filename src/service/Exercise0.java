package service;
public class Exercise0 {
	public static void main (String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", 
				"Aaron", "Kate" };
		
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 
				275, 243, 334, 412, 393, 299, 343, 317, 265 };
				
		if (names.length == times.length) {
			for (int i = 0; i < names.length; i++) {
				System.out.println("Name: " + names[i] + " Time: " + times[i]);
			}
		}
	}
}
