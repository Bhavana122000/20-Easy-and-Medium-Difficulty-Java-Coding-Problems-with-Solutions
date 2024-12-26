import java.util.Scanner; 
class fourCheckIfANumberIsAPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n = sc.nextInt(); 
        String primeOrNon;
        if(n <= 0){
            primeOrNon = "Neither prime nor composite";
        }else if(n == 1){
            primeOrNon = "Non Prime";
        }else if(n == 2){
            primeOrNon = "prime";
        }else{
            primeOrNon = "prime";
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    primeOrNon = "non prime";
                    break;
                }
            }
        }
        System.out.println(primeOrNon);
    }
}