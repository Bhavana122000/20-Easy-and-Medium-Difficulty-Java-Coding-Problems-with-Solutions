import java.util.Scanner; 
import java.util.Set; 
import java.util.HashSet; 
import java.util.List; 
import java.util.ArrayList; 

class elevenFindDuplicatesInAnArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array: "); 
        int n = sc.nextInt(); 
        
        Set<Integer> duplicatesSet = new HashSet<>(); 
        Set<Integer> seenSet = new HashSet<>(); 
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            int item = sc.nextInt();
            if(seenSet.contains(item)){
                duplicatesSet.add(item);
            }else{
                seenSet.add(item);
            }
            list.add(item);
        }
        System.out.println("Items: "+ list); 
        System.out.println("Duplicate Items: "+ duplicatesSet); 
    }
}