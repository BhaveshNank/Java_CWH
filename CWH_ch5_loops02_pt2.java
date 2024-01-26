public class CWH_ch5_loops02_pt2 {
    public static void main(String[] args) {

        //NOTE:
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9

        int n = 10; // prints first 10 numbers 
        for (int i = 0; i < n; i++){
            System.out.println(2*i+1); // the 10 numbers printed are odd
        }
    }
}
