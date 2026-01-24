//4. Check if a given year is a leap year
import java.util.*;
public class QUES4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Check Leap year---------");
        System.out.println("Enter the year you want to check");
        int n = sc.nextInt();
        if((n%4 == 0 && n%100 != 0) || n%400 == 0){
            System.out.println("This is a Leap year");
        } else{
            System.out.println("This is not a leap year");
        }
    }
}
