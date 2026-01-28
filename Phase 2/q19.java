//19. Print Fibonacci series up to n terms.
public class q19 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
