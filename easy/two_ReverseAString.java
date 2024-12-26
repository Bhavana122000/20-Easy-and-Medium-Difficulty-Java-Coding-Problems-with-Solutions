import java.util.Scanner;

public class two_ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		String reverseStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr += String.valueOf(str.charAt(i));
		}
		System.out.println("Reversed String: "+ reverseStr);
	}
}