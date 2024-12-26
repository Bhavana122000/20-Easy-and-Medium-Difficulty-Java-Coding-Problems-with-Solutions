import java.util.Scanner; 
import java.util.Arrays; 
class thirteenFindTheMajorityElementsInAnArray{
    public static void main(String[] args){
        // use Boyer-Moore Voting Algorithm for O(n) time complexity and O(1) space complexity next time.
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the array size: "); 
        int n = sc.nextInt(); 
        
        int[] arr = new int[n]; 
        System.out.println("Enter the array elements: "); 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int majorityElement = -1; 
        for(int i=0; i<n; i++){
            int count = 0; 
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++; 
                }
            }
            
            if(count > n/2){
                majorityElement = arr[i];
                break;
            }
        }
        
        if(majorityElement != -1){
            System.out.println("Majority element: "+ majorityElement); 
        }else{
            System.out.println("No Majority element Found.");
        }
    }
}