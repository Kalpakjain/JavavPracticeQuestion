//34. Take a weekday number (1–7) and determine if it is a weekday or weekend.
import java.util.*;
public class QUES34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weekday number (1-7): ");
        int day = sc.nextInt();
        if(day >= 1 && day <= 5){
            System.out.println("It is a weekday.");
        }else if(day == 6 || day == 7){
            System.out.println("It is a weekend.");
        }else{
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        sc.close();
    }
}
