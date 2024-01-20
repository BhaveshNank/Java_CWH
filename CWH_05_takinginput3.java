import java.util.Scanner;

public class CWH_05_takinginput3 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        // the .hasNextInt method checks whether the input value is integer or not
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //reads only one word from a sentence
        // String str2 = sc.nextLine(); //reads the whole sentence 
        System.out.println(str);
        // System.out.println(str2);
    }
}
