//12. Check voting eligibility for a given age (18+).
import java.util.*;
public class QUES12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>18 && age>0){
            System.out.println("You are eligible for voting ");
        }else{
            System.out.println("You are not eligible for voting ");
        }
        
        sc.close();
    }
}
