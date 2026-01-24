//36.Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
import java.util.*;
public class QUES36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet Your password : ");
        String pass = sc.nextLine();
        boolean digit = false;
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)>='0' && pass.charAt(i)<='9'){
                digit = true;
                break;
            }
        }
        if(pass.length()>=8 && digit){
            System.out.println("Your password is valid.");
        }else{
            System.out.println("Your password is invalid. It must be at least 8 characters long and contain at least one digit.");
        }
        sc.close();
    }
}