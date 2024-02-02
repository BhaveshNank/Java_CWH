public class CWH_ch5_PS06 {
    public static void main(String[] args) {
        // what is factorial n = n* n-1 * n-2 *.....1 
        // 5! = 5*4*3*2*1 = 120 
        int n = 5;
        int i = 1; 
        int factorial = 1;
        while (i<=n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
