//29. Print first n terms of an arithmetic progression (a, d).
public class q29 {
    public static void main(String[] args) {
        int a = 10, d = 5, n = 10;
        for(int i=1; i < n; i++){
            System.out.println(a + (i-1)*d);
        }
    }
}
