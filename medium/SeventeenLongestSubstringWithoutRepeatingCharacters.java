import java.util.Scanner; 
import java.util.List; 
import java.util.ArrayList; 

class SeventeenLongestSubstringWithoutRepeatingCharacters {
    //time complexity O(n^2) as I am clearning everytime the 
    //duplicate is found i start from next element and recheck everything 
    //we'll see sliding window method in next program O(n) TC
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); 
        String str = sc.nextLine();
        char[] chars = str.toCharArray(); 
        List<Character> list = new ArrayList<>();
        
        int start = 0;
        int nextStart = 0; 
        int max  = Integer.MIN_VALUE; 
        while(start != chars.length){
            if(!list.contains(chars[start])){
                list.add(chars[start]);
                start++; 
            }else{
                list.clear();
                nextStart++; 
                start = nextStart; 
            }
            if(list.size() > max){
                max = list.size(); 
            }
            // System.out.println(list +" "+ start+ " "+nextStart);
        }
        
        System.out.println("largest Sub array length: "+ (max));
        
    }
}