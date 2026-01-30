//27. Find the sum of all factors of a number.
public class q27 {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
