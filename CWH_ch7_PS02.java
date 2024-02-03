public class CWH_ch7_PS02 {
    static void pattern1(int n){
        for(int i=0;i<n;i++){    // loop for rows 
            for(int j=0;j<i+1;j++){  // loop for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
