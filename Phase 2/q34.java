//34. Print numbers between 1–100 whose digits add up to a multiple of 3.
public class q34 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=100; i++){
            int num = i;
            while(num != 0){
                sum = sum + (num%10);
                num /= 10;
            }
            if(sum % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
