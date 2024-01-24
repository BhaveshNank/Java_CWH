import java.util.Scanner;

public class ruff {
    public static void main(String[] args) {
        //my code
        System.out.println("Enter subject 1 marks");
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        System.out.println("Enter subject 1 marks");
        int mark2 = sc.nextInt();
        System.out.println("Enter subject 1 marks");
        int mark3 = sc.nextInt();
        
        float average = (mark1 + mark2 + mark3)/3.0f;
        System.out.println("average is " + average);

        if (average >= 40 && mark1 >= 33 && mark2 >= 33 && mark3 >= 33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You have failed! You got less than 33% in a subject or your overall grade is less than 40%");
        }

        //question 2 - harry's code 
        // byte m1,m2,m3;
        // Scanner sc = new Scanner(System.in);
    
        // System.out.println("Enter your marks in physics ");
        // m1 = sc.nextByte();
        // System.out.println("Enter your marks in chemistry ");
        // m2 = sc.nextByte();
        // System.out.println("Enter your marks in maths ");
        // m3 = sc.nextByte();
        // float avg = (m1+m2+m3)/3.0f;
        
        // if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
        //     System.out.println("Congratulations you are promoted");
        // }
        // else{
        //     System.out.println("sorry you have not been promoted");
        // }

    }
}
