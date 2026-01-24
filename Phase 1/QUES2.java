//2. Check if a number is divisible by 5.
import java.util.*;
public class QUES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("The number is divisible by 5 ");
        }
        else{
            System.out.println("The given number is not divisible by 5");
        }
    }
}