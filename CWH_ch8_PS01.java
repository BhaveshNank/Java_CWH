
class Employee2{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class CWH_ch8_PS01 {
    public static void main(String[] args) {
        System.out.println("Practice set oops");
        
        Employee2 harry = new Employee2();

        harry.setName("codewithharry");
        System.out.println(harry.getName());
        harry.salary = 3400;
        System.out.println(harry.getSalary());

    }
}
