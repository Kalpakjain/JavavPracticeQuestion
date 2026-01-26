//6. Print the sum of first n natural numbers.
public class q6 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i=0; i<=n ; i++){
            sum +=i;
        }
        System.out.println("Sum of first n natural number is : " + sum);
    }
}
