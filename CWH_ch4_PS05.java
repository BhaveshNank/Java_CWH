import java.util.Scanner;

public class CWH_ch4_PS05 {
    public static void main(String[] args) {
        System.out.println("Enter a year to check if it is leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // dividing by 100 means century year (ending with 00)
        // century year divided by 400 without remainder is leap year 
        if (year%400==0 && year%100==0){
            System.out.println(year + " is a leap year");
        }
        // not divided by 100 means not a century year
        // year divided by 4 without remainder is leap year
        else if(year%4==0 && year%100!=0){
            System.out.println(year + " is a leap year");
        }
        // if not divided by both 400 (century year) and 4 (not century year)
        // then year is not leap year
        else {
            System.out.println(year + " is not a leap year");
        }
        
        }
    }
