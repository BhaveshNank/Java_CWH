public class CWH_ch7_PS04 {
    static void pattern2(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<n-1;j++){
                System.out.println("*");
                
            }
        }
    }
    public static void main(String[] args) {
        pattern2(4);
    }
}
