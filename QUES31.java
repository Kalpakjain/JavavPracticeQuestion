//31. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
import java.util.*;
public class QUES31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your income (in Lacs) : ");
        double income = sc.nextDouble();
        if(age > 18 && income > 5){
            System.out.println("You are eligible to pay tax.");
        }else{
            System.out.println("You are not eligible to pay tax.");
        }
        sc.close();
    }
}