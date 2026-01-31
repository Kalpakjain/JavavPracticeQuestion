//35. Find the smallest and largest digit in a given number.
import java.util.*;
public class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while(num != 0 ){
            int ld = num % 10 ;
            if(ld>largest){
                largest = ld;
            }
            if(ld<smallest){
                smallest = ld;
            }
            num /= 10;
        }
        System.out.println("Smallest digit is = " + smallest);
        System.out.println("Largest digit is = " + largest);
        sc.close();
    }
}
