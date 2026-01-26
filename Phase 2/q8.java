//8. Print the sum of all odd numbers up to n.
public class q8 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("Sum of even number up to n is : " + sum);
    }
}
