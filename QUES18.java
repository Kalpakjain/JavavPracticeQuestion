//18. Take a 3-digit number and determine if the middle digit is the largest, smallest, or niether.
import java.util.*;
public class QUES18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number : ");
        int a = sc.nextInt();
        int fd = a/100;
        int md = a/10%10;
        int ld = a%10;
        if(md>fd && md>ld){
            System.out.println("Middle digit is the largest");
        }
        else if(md<fd && md<ld){
            System.out.println("Middle digit is the smallest");
        }
        else{
            System.out.println("Middle digit is neither largest nor smallest");
        }
        sc.close();
    }
}
