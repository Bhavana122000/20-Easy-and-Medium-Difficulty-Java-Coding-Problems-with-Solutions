import java.util.Scanner; 
import java.util.Arrays;
 
class twelveCheckIfTwoStringsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the two strings: "); 
        String firstString = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        String secondString = sc.nextLine().toLowerCase().replaceAll("[^a-z]", ""); 
        char[] firstStringArray = firstString.toCharArray(); 
        char[] secondStringArray = secondString.toCharArray(); 
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);
        // String newFirstString = new String(firstStringArray); 
        // String newSecondString = new String(secondStringArray);
        
        // if(newFirstString.equals(newSecondString)){
        if(Arrays.equals(firstStringArray, secondStringArray)){
            System.out.println("Anagrams"); 
        }else{
            System.out.println("Not Anagrams");
        }
    }
}