// program to illustrate Interface inheritance. 

// Interfaces help us to achieve 100% data abstraction since an inteface contain only abstract methods,
// it also helps to achieve multiple inheritance

// Creating an Interface
interface Print{
    void print();
}

// Creating Interface

interface Show{
    void print();
}

// Illustrating Multiple Inheritance through interfaces

public class Program implements  Print {

    // Providing Method Implementation
    public  void print(){
        System.out.println("Hello World");
    }

    // Main Method
    public static void main(String[] args) {

        Program p=new Program();

        p.print();      
    }
    
}
