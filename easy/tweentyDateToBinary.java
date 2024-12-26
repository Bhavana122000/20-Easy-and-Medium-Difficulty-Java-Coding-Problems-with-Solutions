import java.util.Arrays;
public class tweentyDateToBinary {
    public static void main(String[] args) {
        String date = "2080-02-29"; 
        String[] dateArr = date.split("-"); 
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]); 
        int day = Integer.parseInt(dateArr[2]);
        
        String binaryYear = Integer.toBinaryString(year);
        String binaryMonth = Integer.toBinaryString(month); 
        String binaryDay = Integer.toBinaryString(day);
        
        System.out.println(Arrays.toString(dateArr));
        System.out.println(binaryYear+'-'+binaryMonth+'-'+binaryDay);
    }
}

