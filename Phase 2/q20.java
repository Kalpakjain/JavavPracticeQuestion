//20. Print sum of first n terms of Fibonacci series.
public class q20 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int a = 0, b = 1;
        for(int i = 1; i<=n; i++){
            sum += a;
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}
