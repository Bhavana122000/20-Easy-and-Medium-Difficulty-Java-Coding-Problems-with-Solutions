import java.util.Scanner;
import java.util.List; 
import java.util.ArrayList;
import java.util.Set; 
import java.util.HashSet;

class sevenFindIntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        List<Integer> list1 = new ArrayList<>(); 
        List<Integer> list2 = new ArrayList<>(); 
        
        System.out.println("Enter "+n1+" numbers:");
        for(int i=0; i<n1; i++){
            list1.add(sc.nextInt());
        }
        
        System.out.println("Enter "+n2+" numbers:");
        for(int i=0; i<n2; i++){
            list2.add(sc.nextInt());
        }
        
        Set<Integer> set = new HashSet<>(); 
        for(Integer ele : list1){
            if(list2.contains(ele)){
                set.add(ele);
            }
        }
        System.out.println("Common elements: "+ set);
    }
}