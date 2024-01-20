import java.util.Scanner;

public class CWH_05_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        // System.in -> means taking keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        // you can use float/int/anything else according to your needs 
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a + b;
        float sum = a + b;
        System.out.print("The sum of these numbers is: ");
        System.out.println(sum);
    }
}
