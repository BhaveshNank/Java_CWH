public class CWH_ch4_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For logical AND...");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b &&c) {
            System.out.println("Y"); //check associativity from the table of precedence and associativity
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical OR...");

        boolean p = false;
        boolean q = true;

        if (p || q){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical NOT");
        System.out.print("NOT(A) is ");
        System.out.println(!a);
        System.out.print("NOT(b) is ");
        System.out.println(!b);
    }
}
