//21. Check if a number is a multiple of 7 or ends with 7.
import java.util.*;
public class QUES21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is either a multiple of 7 or ends with 7.");
        } else {
            System.out.println(num + " is neither a multiple of 7 nor ends with 7.");
        }
        sc.close();
    }
}
