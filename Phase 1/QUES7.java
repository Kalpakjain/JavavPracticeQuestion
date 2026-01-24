import java.util.*;
public class QUES7 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides Triangle \na : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        if(a+b>c && b+c >a && c+a >b){
            System.out.println("Valid triangle !");
        } else{
            System.out.println("Not a valid triangle !");
        }
        sc.close();
    }
}
