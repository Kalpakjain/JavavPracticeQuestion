//28. Check if a number is a strong number (sum of factorials of digits = number).
public class q28 {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }

        int fac = num * factorial(num - 1);
        return fac;

    }
    public static void main(String[] args) {
        int num = 6, sum = 0; 
        int original = num;
        while(num>0){
            int ld = num % 10;
            sum += factorial(ld);
            num /= 10;
        }

        if(sum == original){
            System.out.println("The number is a Strong number");
        }else{
            System.out.println("The number is not a Strong number");
        }
    }
}
