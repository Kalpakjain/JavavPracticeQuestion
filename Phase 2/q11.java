//11. Count the number of digits in a given number.
public class q11 {
    public static void main(String[] args) {
        int num = 232;
        int count = 0;
        if(num == 0){
            count = 1;
        }else{
            while(num != 0){
                count++;
                num = num/10;
            }
        }
        System.out.println(count);
    }
}
