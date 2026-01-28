//16. Check if a number is a perfect number.
//A number is called perfect if the sum of all its proper factors (except itself) equals the number.
public class q16 {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;
        
        if(num <= 0){
            System.out.println("Not a perfect number");
        }
        //calculate factors and their sum
        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                sum += i; 
            }
        }

        //checking perfect number 
        if(sum == num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number ");
        }
    }
}
