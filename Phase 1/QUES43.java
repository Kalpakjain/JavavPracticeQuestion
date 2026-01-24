//43. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
import java.util.*;
public class QUES43 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number : ");
        int num = sc.nextInt();
        int fd = num / 100;
        int md = num / 10 % 10;
        int ld = num % 10;
        if(fd+ld == md){
            System.out.println("Yes the sum of first and last digit is equal to middle digit");
        } else{
            System.out.println("Try another number !");
        }
        sc.close();
    }
    
}
