//using switch (traditional switch)
import java.util.Scanner;

public class CWH_ch4_04 {
    public static void main(String[] args) {
        System.out.println("Enter a number to know the day of the week");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        switch (val) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number for a day in the week");
            
                
                
                
        }
    }
}
