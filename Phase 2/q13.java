//13. Check if a number is a palindrome.
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check for palindrome : ");
        int n = sc.nextInt();
        int original = Math.abs(n);
        int rev = 0;
         while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if(rev == original){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
        sc.close();
    }
}
