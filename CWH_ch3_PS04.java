public class CWH_ch3_PS04 {
    public static void main(String[] args) {
        String myString = "This is to check  weather string    has double & triple   space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("     ")); //returns -1 since this amount of space not present
    }
}
