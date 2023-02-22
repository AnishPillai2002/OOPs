// Demonstrating Inheritance Employee class is the parent class
// Officer and Manager class are the child class of Employee class


import java.util.Scanner;

class Employee{

    String Name,Address,Phone_no;
    int Age,Salary;

    // Function to Print Salary
    void printSalary(){
        System.out.println(Salary);
    }
}

class Officer extends Employee{
    String Specialization;

    // Function to Read Officer Details
    void readOfficer(){
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Officer Name: ");
        Name=read.nextLine();

        System.out.print("Enter Officer Age: ");
        Age=read.nextInt();
        read.nextLine();

        System.out.print("Enter Phone Number: ");
        Phone_no=read.nextLine();
        

        System.out.print("Enter Address: ");
        Address=read.nextLine();

        System.out.print("Enter Salary: ");
        Salary=read.nextInt();
        read.nextLine();

        System.out.print("Enter Specialization: ");
        Specialization=read.nextLine();
    }

    //  Function to Display Officer Details
    void printOfficer(){
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.Age);
        System.out.println("Phone No.: "+this.Phone_no);
        System.out.println("Address: "+this.Address);
        System.out.print("Salary: ");
        printSalary();  // using function to print salary
        System.out.println("Specialization: "+this.Specialization);
    }
}

class Manager extends Employee{
    String Department;

    // Function to Read Manager Details
    void readManager(){
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Manager Name: ");
        Name=read.nextLine();

        System.out.print("Enter Manager Age: ");
        Age=read.nextInt();
        read.nextLine();            // to read the enter button 

        System.out.print("Enter Phone Number: ");
        Phone_no=read.nextLine();
        

        System.out.print("Enter Address: ");
        Address=read.nextLine();

        System.out.print("Enter Salary: ");
        Salary=read.nextInt();
        read.nextLine();

        System.out.print("Enter Department: ");
        Department=read.nextLine();
    }

    //  Function to Display Officer Details
    void printManager(){
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.Age);
        System.out.println("Phone No.: "+this.Phone_no);
        System.out.println("Address: "+this.Address);
        System.out.print("Salary: ");
        printSalary();
        
        System.out.println("Department: "+this.Department);
    }

}

class Program{
    
    public static void main(String[] args) {

        // Creating Objects
        Officer o=new Officer();
        Manager m=new Manager();

        System.out.println("Enter Officer Details");
        o.readOfficer();

        System.out.println();

        System.out.println("Enter Manager Details");
        m.readManager();

        System.out.println();

        System.out.println("Officer Details");
        o.printOfficer();

        System.out.println();

        System.out.println("Manager Details");
        m.printManager();
        
    }
}