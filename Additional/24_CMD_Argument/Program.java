//input from command line and perform addition , 
//subtraction, division, multiplication

public class Program {

    //Main Method
    public static void main(String[] args) {
        
        int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        int dif=Integer.parseInt(args[0])-Integer.parseInt(args[1]);
        int mul=Integer.parseInt(args[0])*Integer.parseInt(args[1]);
        String div;
        if(Integer.parseInt(args[1])==0){
            div="Not Possible";
        }
        else{
            int result=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
            div=String.valueOf(result);
        }

        System.out.println(args[0]+"+"+args[1]+"="+sum);
        System.out.println(args[0]+"-"+args[1]+"="+dif);
        System.out.println(args[0]+"*"+args[1]+"="+mul);
        System.out.println(args[0]+"/"+args[1]+"="+div);
    }
}

// CMD Argument Passing
// javac Program.java
// java Program 10 20
