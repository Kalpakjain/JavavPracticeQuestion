//14. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
import java.util.*;
public class QUES14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char input = sc.next().charAt(0);
        if(input>='a' && input<='m'){
            System.out.println("lies between a and m");
        }else{
            System.out.println("lies between n and z");
        }
    }
}
