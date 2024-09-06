package Static_Variables;

public class Staticblock {
    //See now we now what are static variables right
    //lets see some ways to intialize it
    static int a=5;
    static int b;

    //static blocks executed as the class is loaded or the class is compiled for the first time
    static{
        b=a*5;
    }

    public static void main(String[] args) {
//        Staticblock st=new Staticblock();
 // You can see here we are accessing static variables via the class name hence they are associated with the class

        System.out.println(Staticblock.a+" "+Staticblock.b);
    }
}
