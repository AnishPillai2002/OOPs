//Demonstration of Polymorphism through method overriding using Abstract Class 




abstract class Shape{

    abstract void number_of_sides();
}

class Triangle extends Shape{

    void number_of_sides(){
        System.out.println("Number of Sides of Triangle = 3 ");
    }
}

class Rectangle extends Shape{

    void number_of_sides(){
        System.out.println("Number of Sides of Rectangle = 4 ");

    }
}

class Hexagon extends Shape{
    void number_of_sides(){
        System.out.println("Number of Sides Hexagon = 6 ");
    }
}


public class Program {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Hexagon h=new Hexagon();

        t.number_of_sides();
        r.number_of_sides();
        h.number_of_sides();
    }


    
}
