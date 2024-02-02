public class CWH_ch7_Method_Overloading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro");
        System.out.println("Good Morning " + b + " bro");
    }
    
    public static void main(String[] args) {
        foo();
        foo(1000);
        foo(2000, 4000);
        // Arguments are actual (actual values)
    }
    }
    

