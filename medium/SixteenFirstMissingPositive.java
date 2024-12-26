import java.util.Scanner; 
import java.util.Set; 
import java.util.HashSet; 

class SixteenFirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter array length: "); 
        int n = sc.nextInt(); 
        System.out.println("Enter array elements"); 
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }
        
        System.out.println("Missing Value: " + findMinElement(arr));
    }
    
    public static int findMinElement(int arr[]){
        Set<Integer> set = new HashSet<>(); 
        
        for(int num: arr){
            if(num > 0){
                set.add(num);
            }
        }
        
        int missing = 1; 
        while(set.contains(missing)){
            missing++;
        }
        
        return missing;
    }
}