import java.util.Scanner; 
import java.util.Arrays; 

class fifteenRotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: "); 
        int n = sc.nextInt(); 
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the array rotation steps: "); 
        int k = sc.nextInt(); 
        
        System.out.println("Array before rotation: "+ Arrays.toString(arr)); 

        // Time complexity O(n*k)
        // for(int i=0; i<k; i++){
        //     int last = arr[n-1]; 
        //     for(int j=n-1; j>0; j--){
        //         arr[j] = arr[j-1];
        //     }
        //     arr[0] = last;
        // }
        
        // method2 timecomplexity O(n)
        reverseArray(arr, 0, n-1); 
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        
        System.out.println("Array after rotation: "+ Arrays.toString(arr)); 
    }
    
    public static void reverseArray(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }
    }
}