//30. Print first n terms of a geometric progression (a, r).
public class q30 {
     public static void main(String[] args) {
        int a = 2, r = 3, n = 5;
        for(int i=0; i < n; i++){
            System.out.println(a*(int)Math.pow(r, i));
        }
    }
}