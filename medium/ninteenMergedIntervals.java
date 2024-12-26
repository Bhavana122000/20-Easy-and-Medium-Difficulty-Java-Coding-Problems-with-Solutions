import java.util.Scanner; 
import java.util.Arrays; 
import java.util.List; 
import java.util.ArrayList; 

class ninteenMergedIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Intervals");
        int n = sc.nextInt(); 
        
        int[][] intervals = new int[n][2];
        System.out.println("Enter the intervals(start and end) values");
        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt(); 
            intervals[i][1] = sc.nextInt(); 
        }
        
        int[][] result = mergedIntervals(intervals);
        System.out.println("Merged Intervals: ");
        for(int[] interval: result){
            System.out.println(Arrays.toString(interval));
        }
    }
    
    public static int[][] mergedIntervals(int[][] intervals){
        if(intervals.length <= 1){
            return intervals; 
        }
        
        Arrays.sort(intervals, (interval1, interval2) -> Integer.compare(interval1[0], interval2[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0]; 
        merged.add(currentInterval); 
        
        for(int[] interval: intervals){
            int currentEnd = currentInterval[1]; 
            int nextStart = interval[0]; 
            int nextEnd = interval[1];
            
            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd, nextEnd); 
            }else{
                currentInterval = interval; 
                merged.add(currentInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]); 
    }
}

// output example 
// Enter the number of Intervals
// 4
// Enter the intervals(start and end) values
// 1 3
// 2 6
// 8 10
// 15 18
// Merged Intervals: 
// [1, 6]
// [8, 10]
// [15, 18]
