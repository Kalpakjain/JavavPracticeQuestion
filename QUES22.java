//22. Take coordinates (x, y) and determine which quadrant the point lies in.
import java.util.Scanner;
public class QUES22 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the coordinates (x,y) : ");
       int x = sc.nextInt();
       int y = sc.nextInt();
       if(x>0 && y>0){
        System.out.println("Cordinates lies in First quadrant ");   
         } else if(x<0 && y>0){
            System.out.println("Cordinates lies in Second quadrant ");
         } else if(x<0 && y<0){
            System.out.println("Cordinates lies in Third quadrant ");
         } else if(x>0 && y<0){
            System.out.println("Cordinates lies in Fourth quadrant ");
         }
         sc.close();
    }
}
