//23. Print all numbers between a and b divisible by 7.
import java.util.*;
public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        if(a<b){
            for(int i = a; i<=b; i++){
                if(i%7 ==0){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
