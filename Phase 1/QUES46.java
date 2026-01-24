//46. Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
import java.util.*;
public class QUES46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        int century;
        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }
        System.out.println(century + "th century");
        sc.close();
    }
}
