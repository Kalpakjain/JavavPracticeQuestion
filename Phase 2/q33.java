//Print all numbers that are palindromes between 1–500.
public class q33 {
    public static void main(String[] args) {
        for(int i = 0; i<=500; i++){
            int num = i;
            int rev = 0;
            while(num != 0){
                rev = rev*10 + (num%10);
                num /= 10;
            }

            if(rev == i){
                System.out.print(i + " ");
            }
        }
    }
}
