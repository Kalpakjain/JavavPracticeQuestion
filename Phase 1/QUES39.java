//39. Take day and month and check if it forms a valid calendar date (ignoring leap years).
import java.util.*;
public class QUES39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day : ");
        int day = sc.nextInt();
        System.out.print("Enter a month ");
        int mon = sc.nextInt();

        boolean isValid = true;
        if(mon < 1 || mon > 12 || day < 1){
            isValid = false;
        } else if(mon == 2 ){
            if(day > 28){
            isValid = false;
            }
        } else if(mon == 4 || mon == 6 || mon == 9 || mon == 11){
            if(day > 30){
                isValid = false;
            }
        } else {
            if (day > 31)
                isValid = false;
        }

        if (isValid)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");

        sc.close();


    }
}
