// break and continue pt 1 - break statements 

public class CWH_ch5_BreakContinue_pt01 {
    public static void main(String[] args) {
        // break and continue using loops!
        // using for loop: 

        // for (int i=0; i<50; i++){
        //     System.out.println(i);
        //     // System.out.println("Java is great");
        //     if (i==2){
        //         System.out.println("Ending loop");
        //         break;
        //     }
        // }

        // using while loop 

        // int i = 0;
        // while(i<5){
        //     System.out.println(i);
        //     // System.out.println("Java is great");
        //     if (i==2){
        //         System.out.println("Ending loop");
        //         break;
        //     }
        //     i++;
        // }

        //using do while loops 

        int i = 0;
        do{
            System.out.println(i);
            if (i==2){
                System.out.println("Ending the loop");
                break; 
            }
            i++;
        }while(i<5);
        System.out.println("Loop ends here");
        
    }
    
}