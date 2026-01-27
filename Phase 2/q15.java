//5. Check if a number is an Armstrong number.
public class q15 {
    public static void main(String[] args) {
        int n = 6;
        int original = Math.abs(n);
        int count = 0;
        int sum = 0;

        // count digits
        if(n == 0){
            count = 1;
        }else{
            while (n != 0){
                count++;
                n = n/10;
            }
        }

        //cal sum according to power
        n = original;

        while(n != 0 ){
            int ld = n % 10;
            sum += Math.pow(ld, count);
            n /= 10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not a armstrong number");
        }

    }
}
