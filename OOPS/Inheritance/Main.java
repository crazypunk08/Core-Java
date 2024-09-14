package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Here Box is superclass and Boxcustom is a child class
        Box box=new Boxcustom(1,2,3,4);
        //here ref type is box but you have created a Boxcustom object ,as boxcustom class extends
        //Box class hence through the constructor of Boxcustom you can intialize the members of Box class also
        //for the object,but you can acess only the members of Box class only
       // System.out.println(box.weight); this gives error as ref type is of Box class and it is unaware of child class

       // Boxcustom box=new Box(1,2,3,4);
        //This gives an error because you have made a Box object in runtime and the Box class constructor cannot
        // intialize weight parameter

        System.out.println(box.l);
    }
}
