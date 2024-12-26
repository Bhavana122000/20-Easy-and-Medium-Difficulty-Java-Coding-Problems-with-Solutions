import java.util.Scanner; 
class fivePalindromeCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string or a number: "); 
        String newString = sc.nextLine(); 
        //method1 preferred
        // String reverseString = "" ; 
        // for(int i=newString.length()-1; i>=0; i--){
        //     reverseString += String.valueOf(newString.charAt(i));
        // }
        // if(newString.equalsIgnoreCase(reverseString)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not a palindrome");
        // }
        
        //method2 
        String cleanedString = newString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        if(cleanedString.equals(reversedString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}