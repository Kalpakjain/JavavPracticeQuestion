//28. Take a number and print “Fizz” if divisible by 3,"Buzz" id divisible by 5, and “FizzBuzz” if divisible by both.
import java.util.*;
public class QUES28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("FizzBuzz");
        }else if(a%3==0){
            System.out.println("Fizz");
        }else if(a%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(a);
        }
        sc.close();
    }

}