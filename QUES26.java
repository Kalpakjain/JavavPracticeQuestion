//26. Check whether a number is a perfect square (without using the square root function).
public class QUES26 {
    public static void main(String[] args) {
        int num = 16;
        if(num<0){
            System.out.println("Negative numbers cannot be a perfect square !");
        }else{
            boolean isPerfectsq = false;
             for(int i=0; i<num/2; i++){
                if(i*i == num){
                    isPerfectsq = true;
                    break;
                }
            }
            if(isPerfectsq){
                System.out.println("The number is perfect square ");
            }else{
                System.out.println("The number is not a perfect square.");
            }
        }
        
    }
}
