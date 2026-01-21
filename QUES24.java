//24. Check if a number lies within the range [100, 999].
import java.util.*;
public class QUES24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num >= 100 && num <= 999) {
            System.out.println(num + " lies within the range [100, 999].");
        } else {
            System.out.println(num + " does not lie within the range [100, 999].");
        }
        sc.close();
    }
}
