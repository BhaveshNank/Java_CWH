class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setID(int i){
        this.id = i;
         
    }
    public int getID(){
        return id;  
    }

    
}   


public class CWH_ch9_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; -> throws error due to private access modifiers 
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}
