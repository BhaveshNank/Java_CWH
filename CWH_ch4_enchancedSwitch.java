public class CWH_ch4_enchancedSwitch {
    public static void main(String[] args) {
        String var = "saurabh";

        switch (var) {
            case "shubham" -> {
                System.out.println("you are going to become an adult");
            }
            case "saurabh" -> System.out.println("you are going to join a job");
            case "vishaka" -> System.out.println("You are getting retired");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my java code");
    }
}
