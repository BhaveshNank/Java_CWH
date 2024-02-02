public class CWH_Method_overloading02 {
    static void change(int a){ // command passed to change integer
        a = 98;
    }
    static void change2(int [] arr){ // command passed to change an array
        arr[0] = 98;
    }
    
    public static void main(String[] args) {
        // case1: Changing an Integer
        int x = 45;
        change(x); // a copy of the object is passed into the change method above
        System.out.println("The value of x after running change is " + x);
        // output is the same, i.e does not change 

        // case2: Changing an Array
        int [] marks = {52, 73, 77, 89, 98, 94}; // this is an array object and marks is a reference means marks is storing the array's address
        change2(marks); // since the reference of the object is passed and not the copy, hence the array is changed
        System.out.println("The value of x after running change is " + marks[0]);


    }
}
