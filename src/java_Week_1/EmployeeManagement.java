package java_Week_1;// java_30.Employee class contains the instance variable to store employee details
// Creating a Constructor to initialize the employee details
// Create java_30.Employee objects using the constructor

class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 100000);
        Employee emp2 = new Employee(102, "Jane", 120000);

        emp1.display();
        emp2.display();
    }
}
