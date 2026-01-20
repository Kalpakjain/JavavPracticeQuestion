//17. Take a 3-digit number and check if all digits are distinct.
import java.util.*;
public class QUES17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number : ");
        int a = sc.nextInt();
        int digit1 = a/100;
        int digit2 = a/10%10;
        int digit3 = a%10;
        if(digit1 != digit2 && digit2 != digit3 && digit1 != digit3){
            System.out.println("All digits are distinct");
        }
        else{
            System.out.println("Digits are not distinct");
        }
        sc.close();
    }
}
