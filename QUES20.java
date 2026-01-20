//20. Check whether a given integer is single-digit, double-digit, or multi-digit.
import java.util.*;
public class QUES20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int absNum = Math.abs(num); // Handle negative numbers
        if (absNum >= 0 && absNum <= 9) {
            System.out.println(num + " is a single-digit number.");
        } else if (absNum >= 10 && absNum <= 99) {
            System.out.println(num + " is a double-digit number.");
        } else {
            System.out.println(num + " is a multi-digit number.");
        }   
        sc.close();
    }
    
}
