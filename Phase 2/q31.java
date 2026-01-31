//31. Print all numbers whose sum of digits is even (1–100).
public class q31 {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}