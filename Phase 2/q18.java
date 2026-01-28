//18. Check if a number is prime or not.
import java.util.*;
public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2 ; i * i <= n; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}
