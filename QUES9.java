import java.util.*;
public class QUES9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int m = sc.nextInt();
        if (m>=0 && m<=100){
            if(m<=59){
                System.out.println("You Grade is F ");
            }
            else if(m>59 && m<=69){
                System.out.println("Your Grade is D ");
            }
            else if(m>69 && m<=79){
                System.out.println("Your Grade is C ");
            }
            else if(m>79 && m<=89){
                System.out.println("Your Grade is B ");
            }
            else {
                System.out.println("Your Grade is A ");
            }
        } else{
            System.out.println("Please enter the valid marks !");
        }
    }
}
