import java.util.Scanner; 
import java.util.Set; 
import java.util.HashSet;
import java.util.Collections;

class eightFindTheSecondLargestNumberInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = 0;
        while(!(n > 1)){
            System.out.println("Enter the size of the array > 1 : "); 
            n = sc.nextInt(); 
        }
        System.out.println("Enter "+n+" numbers: ");
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while(count < n){
            int item = sc.nextInt();
            if(!set.contains(item)){
                set.add(item);
                count++;
            }else{
                System.out.println("Duplicate's not allowed enter others ");
            }
        }
        set.remove(Collections.max(set)); 
        System.out.println("Max element: "+ Collections.max(set));
    }
}