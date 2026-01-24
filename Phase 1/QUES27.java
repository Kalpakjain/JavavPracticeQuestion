//27. Take a character and check if it is a letter, a digit, or neither.
import java.util.*;
public class QUES27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char a = sc.nextLine().charAt(0);
        if(a>='a'&& a<='z' || a>='A' && a<='Z'){
            System.out.println(a + " is a letter");
        }else if(a>='0' && a<='9'){
            System.out.println(a + " is a digit");
        }else {
            System.out.println(a+ " is neither letter nor digit");
        }
        sc.close();
    }

}
