//37. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
import java.util.*;
public class QUES37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate : ");
        float x = sc.nextFloat();
        System.out.print("Enter the y coordinate : ");
        float y = sc.nextFloat();
        if(x==0 && y==0){
            System.out.println("Point lies on the origin");
        } else if(y==0){
            System.out.println("Point lies on x axis");
        } else if (x==0){
            System.out.println("Point lies on y axis");
        } else{
            System.out.println("Point lies in any quadrant not on the axis");
        }
        sc.close();
    }
}
