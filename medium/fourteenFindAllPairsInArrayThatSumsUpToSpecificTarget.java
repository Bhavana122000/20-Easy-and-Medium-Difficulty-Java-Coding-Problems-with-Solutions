import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class fourteenFindAllPairsInArrayThatSumsUpToSpecificTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        findPairs(arr, targetSum);
    }
    
    public static void findPairs(int[] arr, int targetSum){
        Set<Integer> seen = new HashSet<>(); 
        Set<String> pairs = new HashSet<>(); 
        
        for(int num : arr){
            int complement = targetSum - num; 
            if(seen.contains(complement)){
                String pair = complement < num ? complement+","+num : num+","+complement;
                pairs.add(pair);
            }
            seen.add(num);
        }
        
        System.out.println("Pairs with sum "+targetSum+":"+pairs);
    }
}