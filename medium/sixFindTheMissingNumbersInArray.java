import java.util.Scanner; 
import java.util.Set; 
import java.util.HashSet;

class sixFindTheMissingNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        Set<Integer> set = new HashSet<>(); 
        System.out.println("Enter "+(n - 1)+" numbers between "+1+" to "+ n);
        int count = 0; 
        while(count < (n - 1)){
            int item = sc.nextInt(); 
            if(set.contains(item)){
                 System.out.println("Duplicate entries are not allowed");
            }else if(item > n || item < 1){
                System.out.println("Invalid! enter only in range of 1 to "+ n);
            }else{
                set.add(item);
                count++;
            }
        }
        
        System.out.println("Missing numbers: ");
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}