import java.math.*;
public class QUES10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if((Math.max(a, b)) % (Math.min(a, b)) == 0 ){ //or a%b ==0 || b%a ==0
            System.out.println((Math.max(a, b)) +" is a multiple of " +
            (Math.min(a, b)));
        } else{
            System.out.println("There is no multiple of one another exist !");
        }
    }
}
