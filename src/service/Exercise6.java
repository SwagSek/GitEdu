package service;

public class Exercise6 {

	private static final byte[] ARRAY = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101, 32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
	
	public static String getTextFromBytes(byte[] array) {
		String text = "";
		for (int currentByte : array) {
			text += (char)currentByte;
		}
		return text;
	}
	
	public static void main(String[] args) {
		System.out.println(getTextFromBytes(ARRAY));
	}

}
