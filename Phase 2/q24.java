//24. Find HCF (GCD) of two numbers using loops.
public class q24 {
    public static void main(String[] args) {
        int a =10;
        int b = 100;
        int hcf = 1;
        for(int i=1; i<=Math.min(a, b); i++ ){
            if(a%i==0 && b%i == 0){
                hcf = Math.max(hcf, i);
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is = " + hcf);
    }
}
