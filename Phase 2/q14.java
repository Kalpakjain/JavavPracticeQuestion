//14. Find the sum of digits of a number.
public class q14 {
    public static void main(String[] args) {
        int n =2324;
        int sum = 0;
        while(n != 0){
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println(sum);
    }
}
