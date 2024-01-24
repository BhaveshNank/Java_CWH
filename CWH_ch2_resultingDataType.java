public class CWH_ch2_resultingDataType {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + 5;
        System.out.println(b);

        // increment and decrement operators 
        int i = 56;
        // int b = i++ // first b is assigned to i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // Quiz 
        int p = 7;
        int q = ++p * 8;
        System.out.println(q);

    }
}
