package Static_Variables;

public class Main1 {
    static String name;
    Main1(String name){
        //remember static variables are not instance variables hence they are not accesed through this
        Main1.name=name;
    }
}
