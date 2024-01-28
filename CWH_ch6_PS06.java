public class CWH_ch6_PS06 {
    public static void main(String[] args) {
        int [] arr = {45, 13, 51, 60, 32, 75, 81};
        int max = arr[0]; // you can also leave it as max = 0
        
        // using for loop 

        for (int i=0; i<arr.length; i++){
            // System.out.println(arr[i]);
            if (arr[i]>max){
                max = arr[i];   
            }   
        }
        System.out.println(max);
        
        // using for-each loop 

        // for(int element: arr){
        //     if (element>max){
        //         max = element;
        //     }
        // }
        // System.out.println(max);
    }
}
