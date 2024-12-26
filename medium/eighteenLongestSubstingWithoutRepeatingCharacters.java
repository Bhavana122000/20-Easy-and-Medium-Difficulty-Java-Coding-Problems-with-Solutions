import java.util.Scanner; 
import java.util.HashSet;

class eighteenLongestSubstingWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //timecomplexity O(n) - Slifing window techneque
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string: "); 
        String str = sc.nextLine(); 
        System.out.println("Longest substring length: "+longestSubstringLength(str));
    }
    
    public static int longestSubstringLength(String str){
        HashSet<Character> set = new HashSet<>(); 
        int left = 0, maxLen = 0; 
        
        for(int right=0; right<str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right)); 
            maxLen = Math.max(maxLen, right-left+1); 
        }
        
        return maxLen;
    }
}