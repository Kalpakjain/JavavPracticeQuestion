//30. Take 24-hour time (hours and minutes) and print whether it is AM or PM.
import java.util.*;
public class QUES30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter hours (0-23): ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();
        if(hours < 12){
            System.out.println(hours + ":" + minutes + " AM");
        }else{
            System.out.println((hours-12) + ":" + minutes + " PM");
        }
        sc.close();
    }
}
