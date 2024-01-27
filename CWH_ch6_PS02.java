public class CWH_ch6_PS02 {
    public static void main(String[] args) {

        int [] marks = {45, 50, 71, 80, 97};
        int num = 71;
        boolean isInArray = false;
        for (float element: marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The element is present in the array");
        }
        else {
            System.out.println("The element is not present in the array");
        }



        // my solution: not absolutely correct but good understanding 
        // int [] array = {1, 2, 4, 5};

        //  // find whether 5 is in the array or not 
        // for (int i=0; i<array.length; i++){
        //     int p = array[i]; // array[i] is the elements in the array, and we are assigning a variable p to array[i]
        //     if (p==5){        // or simply use if (array[i]==5)
        //         System.out.println("Element present in array");
        //         break;
        //     }   
        //     else{
        //         System.out.println("Element not present in the array");
        //     }
        // }

    }
}
