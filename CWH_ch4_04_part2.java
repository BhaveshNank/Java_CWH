// using enchanced switch 
import java.util.Scanner;

public class CWH_ch4_04_part2 {

    public static void main(String[] args) {
        System.out.println("Enter the number to know the day of the week");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}