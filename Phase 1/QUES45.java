//45. Take two dates (day and month) and determine which one comes first in the calendar.
import java.util.*;
public class QUES45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //first date
        System.out.print("Enter the first day : ");
        int fd = sc.nextInt();
        System.out.print("Enter the first month : ");
        int fm = sc.nextInt();

        //second date
        System.out.print("Enter the second day : ");
        int sd = sc.nextInt();
        System.out.print("Enter the second month : ");
        int sm = sc.nextInt();

        if(fm<sm){
            System.out.println(fd + "-" + fm + " will come first in calender");
        } else if(sm<fm){
            System.out.println(sd + "-" + sm + " will come first in calender");
        } else{
            if(fd<sd){
                System.out.println(fd + "-" + fm + " will come first in calender");
            } else if(sd<fd){
                System.out.println(sd + "-" + sm + " will come first in calender");
            } else{
                System.out.println("Both date are same !");
            }
        }
        sc.close();
    }
}
