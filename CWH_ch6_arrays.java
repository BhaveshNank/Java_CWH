public class CWH_ch6_arrays {
    public static void main(String[] args) {

        // there are 3 main ways to create an array in java 
        // 1. declaration + memory allocation 
        int [] marks = new int[5]; 
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 96;
        System.out.println(marks[0]);

        // 2. Declaration then memory allocation 
        // int [] marks; 
        // marks = new int[5];
        // continue with adding elements in the array 

        //3. Declaration, memory allocation and initialization together 
        // int [] marks = {98, 45, 79, 99, 80};
    }
}
