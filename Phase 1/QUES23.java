//23. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
public class QUES23 {
    public static void main(String[] args) {
        int amo = 200;
        if(amo % 2000 == 0 || amo % 500 == 0 || amo % 100 == 0){
            System.out.println(amo + " can evenly divided into currency notes");
        }else{
            System.out.println(amo + " can not be evenly divided into currency notes");
        }
    }
}
