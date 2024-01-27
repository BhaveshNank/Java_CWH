public class CWH_ch6_PS01 {
    public static void main(String[] args) {
        float [] numbers = new float[5];
        
        numbers[0] = 45.6f;
        numbers[1] = 50.2f;
        numbers[2] = 40.1f;
        numbers[3] = 32.9f;
        numbers[4] = 12.5f;

        float sum = 0;
        for (int i=0;i<numbers.length;i++){
            sum = sum + (numbers[i]);   
        }
        System.out.println(sum);

        // solving with for each loop
        // System.out.println("Calculating sum using for each loop");
        // for (float element: numbers){
        //     sum = sum + element;
        // }
        // System.out.println(sum);

    }
}
