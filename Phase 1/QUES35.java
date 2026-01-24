//35. Take electricity units consumed and calculate the bill as per slabs (using if-else).
import java.util.*;
public class QUES35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0;
        if(units<=100 && units >= 0){
            billAmount = units*3;
        }else if(units <=200 ){
            billAmount = units*5;
        }else if(units <=300 ){
            billAmount = units*6.5;
        }else if(units > 300 ){
            billAmount = units*8;
        } else{
            System.out.println("Please enter a valid unit to calculate your electricity bill !");
        }
        System.out.println("Your electricity bill is : " + billAmount);
        sc.close();
    }
}
