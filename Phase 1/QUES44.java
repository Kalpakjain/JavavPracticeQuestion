//44. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
import java.util.*;
public class QUES44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1-9999 : ");
        int num = sc.nextInt();
        int fd = num/1000;
        int sd = num/100%10;
        int td = num/10%10;
        int ld = num%10;
        if((fd+sd+td+ld) > (fd*sd*td*ld)){
            System.out.println("The sum of digits is greater than the products of digits");
        }else{
            System.out.println("The sum of digit is not greater than the product of digits");
        }
        sc.close();
    }
}
