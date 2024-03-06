class MyMainEmployee{
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

    public MyMainEmployee(){
        id = 45;
        name = "Your-name";
    }
    public MyMainEmployee(String Myname, int Myid){
        id = Myid;
        name = Myname;
    }
}

public class CWH_ch9_Constructor {
    public static void main(String[] args) {
        // MyMainEmployee harry = new MyMainEmployee("codewithharry", 22);
        MyMainEmployee harry = new MyMainEmployee();
        // harry.setID(22);
        // harry.setName("Codewitharry"); -> we will set it through the constructor
        System.out.println(harry.getName());
        System.out.println(harry.getID());
    }
}
