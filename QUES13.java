//13. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
import java.util.*;
public class QUES13 {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first numbers : ");
    int a = sc.nextInt();
    System.out.print("Enter second number : ");
    int b = sc.nextInt();
    if(a%2==0 && b%2==0){
        System.out.println("Both are even");
        }else if(a%2 != 0 && b%2 != 0){
        System.out.println("Both are odd number");
        }
        else{
            if(a%2==0){
                System.out.println(a + " is even and " + b + " is odd ");
            } else{
                System.out.println(b + " is even and " + a + " is odd ");
            }
        }
    sc.close();
    }
}
