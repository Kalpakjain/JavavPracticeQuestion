import java.util.*;
public class QUES8 {
    public static boolean CheckTriangle(int a,int b, int c){
        if(a+b>c && b+c >a && c+a >b){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides Triangle \na : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        boolean rslt = CheckTriangle(a, b, c);
        if(rslt == true){
            if(a==b && b==c ){
                System.out.println("Equilateral triangle !");
            }
            else if(a==b|| b==c || c==a){
                System.out.println("Isosceles triangle !");
            }
            else{
                System.out.println("Scalene triangle !");
            }
        } else{
            System.out.println("Please enter a valid triangle !");
        }
        sc.close();
    }
}
