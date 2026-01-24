//38. Take three numbers and check if they can form a Pythagorean triplet.
import java.util.*;
public class QUES38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)){
            System.out.println("The numbers form a Pythagorean triplet");
        } else{
            System.out.println("The numbers do not form a Pythagorean triplet");
        }
        sc.close();


    }
}
