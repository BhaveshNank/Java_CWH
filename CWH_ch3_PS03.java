public class CWH_ch3_PS03 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot";
        String replString = letter.replace("<|name|>", "Bhavesh");
        System.out.println(replString);
        // you can also do this this way
        String letter2 = "Dear <|name|>, Thanks a lot";
        letter2.replace("<|name|>", "Bhavesh"); //this will not work as letter is refering to the original letter
        letter2 = letter2.replace("<|name|>", "Bhavesh"); //now this letter is refering to the replaced name in the letter
        System.out.println(letter2); 

    }
}
