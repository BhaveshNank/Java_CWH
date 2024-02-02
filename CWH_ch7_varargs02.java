public class CWH_ch7_varargs02 {
    
    static int sum(int x, int ...arr){ // int x, int ...arr means you already have a value present in the arr (atleast one value is required) then you can add, i.e arr is not empty.
        int result = x;
        for(int a: arr){
            result += a;

        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("The sum of Nothing is " + sum());// This throws error since sum cannot be 0 there is a compulsory value of x
        System.out.println("Sum of 1 is " + sum(1));
        System.out.println("Sum of 1 and 2 is " + sum(1,2));
        System.out.println("Sum of 3 and 5 is " + sum(3,5 ));
    }   
}

