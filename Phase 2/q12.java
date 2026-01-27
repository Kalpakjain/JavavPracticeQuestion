//12. Print the reverse of a given number.
public class q12 {
    public static void main(String[] args) {
        int num = 233;
        if (num == 0){
            System.out.println(0);
        }
        while (num != 0){
            int ld = num%10;
            System.out.print(ld);
            num = num/10;
        }
    }
}

