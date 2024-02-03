class Employee{
    int id;
    int salary;
    String name;
    public void getDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_ch8_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // instantiating a new Employee object
        Employee john = new Employee(); // instantiating a new Employee object

        // setting Attributes (properties) for harry
        harry.id = 12;
        harry.name = "Codewithharry";
        harry.salary = 3400;

        // setting Attributes for john
        john.id = 17;
        john.name = "John Khandelwal";
        john.salary = 1200;

        //printing the attributes 
        // System.out.println(harry.id);
        // System.out.println(harry.name);


        // since we have created a method to print the attributes (getDetails)
        // we will just run the method instead of printing the attributes now
        harry.getDetails();
        john.getDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        int salary2 = harry.getSalary();
        System.out.println(salary2);

        

        
        
    }
}
