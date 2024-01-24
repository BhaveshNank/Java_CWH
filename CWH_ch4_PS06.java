import java.util.Scanner;

public class CWH_ch4_PS06 {
    public static void main(String[] args) {
        System.out.println("Enter the website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        System.out.println(website);
        if (website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else {
            System.out.println("Website is not recognisable");
        }


    }
}
