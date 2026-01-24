//41. Take three numbers and check if they are in arithmetic progression.
import java.util.*;
public class QUES41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        
        if((b-a) == (c-b)){
            System.out.println("The number are in AP");
        } else{
            System.out.println("Numbers are not in AP");
        }
        sc.close();
    }
}
