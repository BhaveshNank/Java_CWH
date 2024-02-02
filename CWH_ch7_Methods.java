public class CWH_ch7_Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a  = 5;
        int b = 7;
        int c;

        // Method invocation using object creation
        // CWH_ch7_Methods obj = CWH_ch7_Methods();
        // c = obj.logic(a,b);

        c = logic(a, b);

        int a1 = 2;
        int b1 = 1;
        int c1; 
        c1 = logic(a1, b1);  
        System.out.println(c);
        System.out.println(c1);

// note if you change the value of anything in the logic method above, that will 
// not change the value of a,b,c in the main class as a, b is only copied to the method above

    }
}
