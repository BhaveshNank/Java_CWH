public class CWH_ch6_PS08 {
    public static void main(String[] args) {

        
        // int [] arr = {25, 13, 45, 51, 49, 30};
        int [] arr = {45, 50, 51, 59, 65, 71, 13};
        boolean isSorted = true;

        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}