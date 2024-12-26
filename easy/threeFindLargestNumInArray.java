import java.util.Scanner;
import java.util.Arrays;
class threeFindLargestNumInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter array length: "); 
        int n = sc.nextInt(); 
        System.out.println("Enter the "+n+" array elements");
        int[] arrNumbers = new int[n] ;
        arrNumbers[0] = sc.nextInt();
        int largestNumber = arrNumbers[0]; 
        for(int i=1; i<n; i++){
            arrNumbers[i] = sc.nextInt();
            if(arrNumbers[i] > largestNumber) 
            largestNumber = arrNumbers[i];
        }
        
        System.out.println(Arrays.toString(arrNumbers));
        System.out.println("Largest Number: " +largestNumber);
    }
}