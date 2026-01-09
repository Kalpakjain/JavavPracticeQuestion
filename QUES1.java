//1. Take a number and print whether it’s positive, negative, or zero.
import java.util.*;
public class QUES1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float n = sc.nextFloat();
        if(n>0){
            System.out.println("Number is positive !");
        }
        else if(n<0){
            System.out.println("Number is negative !");
        } else{
            System.out.println("Number is zero !");
        }
    }
}