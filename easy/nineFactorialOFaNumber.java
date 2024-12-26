import java.util.Scanner; 

class nineFactorialOFaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int fact = 1; 
        if(n < 0){
            System.out.println("Factorial is not definef for negative numbers ");
        }else{
            for(int i=n; i>1; i--){
                fact *= i; 
            }
            System.out.println("Factorial of a number is: "+ fact);
        }
    }
}