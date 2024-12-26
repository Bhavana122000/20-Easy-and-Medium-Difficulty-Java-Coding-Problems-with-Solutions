import java.util.Scanner; 

class tenReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); 
        boolean isNegative = n < 0;
        String num = Integer.toString(Math.abs(n)); 
        
        StringBuilder str = new StringBuilder(num); 
        StringBuilder reversedStr = str.reverse(); 
        
        int reversedNum = Integer.parseInt(reversedStr.toString()); 
        
        if(isNegative){
            reversedNum = -reversedNum; 
        }
        
        System.out.println("Reversed number: "+ reversedNum);
    }
}