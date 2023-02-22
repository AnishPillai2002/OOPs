

// Program to demonstrate Garbage Collection
// System.gc() explicitly do garbage collection but there is no gurantee


// Creating a class Student to store student detail
class Student{
    int roll_no;
    String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}


public class GC{

        // Main Method
        public static void main(String[] args) {
            
            // Free Memory Before Creating Object
            System.out.println("Free Memory Before Creating Object : "+Runtime.getRuntime().freeMemory());

            // Creating Object
            Student s=new Student(1,"Anish");

            //Free Memory After Creating Object
            System.out.println("Free Memory After Creating Object  : "+Runtime.getRuntime().freeMemory());


            s=null; // Now the Student Object does not have any reference

            // Doing Garbage Collection
            System.gc();

            //Free Memory After doing GC
            System.out.println("Free Memory After Garbage Collection  : "+Runtime.getRuntime().freeMemory());


        }
}