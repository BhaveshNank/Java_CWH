public class CWH_ch7_PS03 {
        // sum(5) = 5+4+3+2+1
        // sum(5) = 5 + (5-1)+ ...1
        // sum(n) = n + (n-1)+ ...1
    static int sum(int n){
    // base condition
        if(n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
          }
    
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(sum(x));
    }
}
