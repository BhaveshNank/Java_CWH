public class CWH_ch6_forloop_in_arrays {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 80};
        // Displaying the array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
        //Quiz: Displaying the array in reverse order using for loop 
        System.out.println("Printing in reverse order ");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //Quiz: Displaying array in reverse order using for-each loop
        System.out.println("Printing using for-each loop");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
