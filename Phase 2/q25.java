//25. Find LCM of two numbers using loops.
public class q25 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int lcm = Math.max(a, b);
        while(true){
            if(lcm % a == 0 && lcm % b ==0 ){
                break;
            }
            lcm++;
        }
        System.out.println("LCM = " + lcm);
        
    }
}
