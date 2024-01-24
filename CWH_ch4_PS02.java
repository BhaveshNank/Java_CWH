import java.util.Scanner;

public class CWH_ch4_PS02 {
    public static void main(String[] args) {
        /*
         take 3 subject marks from student 
         40% -> total and 33% -> in each subject to pass
         using and operator and conditionals solve this problem 
         */
        System.out.println("Enter subject 1 marks");
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        System.out.println("Enter subject 1 marks");
        float mark2 = sc.nextFloat();
        System.out.println("Enter subject 1 marks");
        float mark3 = sc.nextFloat();
        
        float average = (mark1 + mark2 + mark3)/3;
        System.out.println("average is " + average);

        if (average >= 40 && mark1 >= 33 && mark2 >= 33 && mark3 >= 33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You have failed! You got less than 33% in a subject or your overall grade is less than 40%");
        }



    }
}
