//Write two Java classes Employee and Engineer. Engineer should inherit from Employee class.
// Employee class to have two methods display() and calcSalary().

// Write a program to display the engineer salary 
// and to display from Employee class using a single object instantiation


// Parent class
class Employee{
    public void display(){
        System.out.println("Name of class is Employee");
    }

    public void calcSalary(){
        System.out.println("Salary of Employee is 10000");
    }
}

// Child Class
class Engineer extends Employee{
    // Method Overriding
    public void display(){
        super.display();         // Using super keyword for accesing parent class method
    }

    public void calcSalary(){
        System.out.println("Salary of Employee is 20000");
    }
}


public class Program {
    
    // Main Method
    public static void main(String[] args) {

        // creating a single object of child class
        Engineer obj=new Engineer();

        // Accessing Child class Methods
        obj.display();
        obj.calcSalary();   
    }    
}
