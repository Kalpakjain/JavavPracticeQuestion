//10. Print the product of digits of a given number.
public class q10 {
    public static void main(String[] args) {
        int n = 323;
        int mul = 1;
        while(n>0){
            int ld = n%10;
            mul = mul * ld;
            n = n/10;
        }
        System.out.println(mul);
    }
}
