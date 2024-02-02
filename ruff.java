public class ruff {

    public static void main(String[] args) {
        // factorial(5) = 5 * 4 * 3 * 2 * 1
        int factorial = 4; 
        for (int i = factorial; i >= 1; i--){ 
            factorial *= i;
            System.out.println(factorial);
        }
    }
}