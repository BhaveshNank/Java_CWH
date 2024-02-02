public class CWH_ch7_varargs {

    static int sum(int a, int b){   // method to add 2 numbers 
        return a+b;
    }
    static int sum(int a, int b, int c){ // method to add 3 numbers 
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){ // method to add 4 numbers 
        return a+b+c+d;
    }

    static int sum(int ...arr){   // this produces sum of any amount of numbers 
        // available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5, 4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));;
        System.out.println(sum(1+2+3+4+5+6+7+8+9)); 
        System.out.println("The sum of Nothing is " + sum()); // return 0 as no value in sum
        System.out.println(sum(1)); // returns 1 since only 1 is present 
    }
}

// lets say you have to add many numbers and you are not sure how many numbers 
// you will be told to add so therefore you create the varargs method

