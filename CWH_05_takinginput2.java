import java.util.Scanner;

public class CWH_05_takinginput2 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        // the .hasNextInt method checks whether the input value is integer or not
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
