

public class Area {

    // Area of Circle
    static void area(double r){

        double area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }

    // Area of Rectangle
    static void area(double l,double b){

        double area=l*b;
        System.out.println("Area of Rectangle: "+area);
    }

    // Area of triangle
    static void area(float b,float h){

        double area=0.5*b*h;
        System.out.println("Area of Triangle: "+area);
    }

    // Main Method
    public static void main(String[] args) {
        
        area(2);
        area(2,2);
        area(2.5,3);
    }
    
}
