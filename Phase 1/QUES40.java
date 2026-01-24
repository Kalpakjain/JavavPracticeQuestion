//40. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
import java.util.*;
public class QUES40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours(1-12): ");
        int hr = sc.nextInt();
        System.out.print("Enter the minutes(1-59) : ");
        int min = sc.nextInt();

        int minTOhr = min/5;
        int angle = Math.abs(minTOhr-hr)*30 + (min%5)*6;

        angle = Math.min(angle, 360-angle);

        System.out.println("The smaller angle between minute hand and hour hand is : " + angle + " degree");
        sc.close();

    }
}
