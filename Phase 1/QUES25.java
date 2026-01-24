//25. Take two angles of a triangle and compute the third angle.
import java.util.*;
public class QUES25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle of a triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter Second angle of a triangle : ");
        int b = sc.nextInt();
        int c = 180-(a+b);
           if (a > 0 && b > 0 && c > 0 && (a+b)<180) {
            System.out.println("Third angle of the triangle is: " + c);
        } else {
            System.out.println("Invalid angles! Triangle not possible.");
        }
        sc.close();
    }
}
