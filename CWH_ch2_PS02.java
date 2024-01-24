public class CWH_ch2_PS02 {
        public static void main(String[] args) {
        char grade = 'B';
        // Encrypting the grade
        grade = (char)(grade + 8);
        System.out.println(grade);
        
        // Decrypting grade
        grade = (char)(grade - 8);
        System.out.println(grade);

    }
}