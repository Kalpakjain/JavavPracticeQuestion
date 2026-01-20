//19. Take a 4-digit number and check if the first and last digits are equal.
import java.util.*;
public class QUES19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number : ");
        int a = sc.nextInt();
        int firstDigit = a / 1000;
        int lastDigit = a % 10;
        if (firstDigit == lastDigit) {
            System.out.println("The first and last digits are equal.");
        } else {
            System.out.println("The first and last digits are not equal.");
        }
        sc.close();
    }
}
