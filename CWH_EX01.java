import java.util.Scanner;

public class CWH_EX01 {
    public static void main(String[] args) {
        System.out.println("Taking input from user: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 mark: ");
        int a = sc.nextInt();
        System.out.println("Enter subject 2 mark: ");
        int b = sc.nextInt();
        System.out.println("Enter subject 3 mark: ");
        int c = sc.nextInt();
        System.out.println("Enter subject 4 mark: ");
        int d = sc.nextInt();
        System.out.println("Enter subject 5 mark: ");
        int e = sc.nextInt();
        
        int sum = a + b + c + d + e; 
        int percentage = sum/5;
        System.out.println(percentage);
    }
}
//ex - done by ~Bhavesh