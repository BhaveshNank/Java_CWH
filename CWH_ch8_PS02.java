class Cellphone{

    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
}


public class CWH_ch8_PS02 {
    public static void main(String[] args) {
        System.out.println("Cellphone");
        Cellphone samsung = new Cellphone();
        samsung.ring();
        samsung.vibrate();
    }
}
