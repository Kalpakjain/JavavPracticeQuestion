//9. Print the factorial of a given number.
public class q9 {
    public static void main(String[] args) {
        int n = 4;
        int fac = 1;
        while(n>0){
            fac = fac * n;
            n--;
        }
        System.out.println(fac);
    }
}
