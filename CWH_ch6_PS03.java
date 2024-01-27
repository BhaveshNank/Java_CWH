public class CWH_ch6_PS03 {
    public static void main(String[] args) {

        float [] physics = {55.5f, 43, 21.5f, 78, 98.5f};
        // using for loop
        
        // float sum = 0;
        // for (int i=0; i<physics.length;i++){
        //     sum = sum + physics[i];
        // }
        // System.out.println(sum);

        //using for-each loop
        float sum = 0;
        for (float element: physics){
            sum = sum + element;
            
        }
        System.out.println("The sum is " + sum);
        float avg = sum/physics.length;
        System.out.println("The average is " + avg);
        
        
    }
}
                                               