package problemSolving;

import java.util.Scanner; 

public class oneSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String numStr = Integer.toString(num);
		int sumOfDigits = 0;
		for(int i=0; i<numStr.length(); i++) {
			sumOfDigits += Character.getNumericValue(numStr.charAt(i));
		}
		System.out.println(sumOfDigits);
	}

}