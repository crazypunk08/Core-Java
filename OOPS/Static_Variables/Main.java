package Static_Variables;

//Packages are containers for classes. They are used to keep the class name space compartmentalized.
//For example, a package allows you to create a class named List, which you can store in your own package without
//concern that it will collide with some other class named List stored elsewhere. Packages are stored in a hierarchical
// manner and are explicitly imported into new class definitions.
public class Main {
    public static void main(String[] args) {
//        Human hm=new Human(22,"Naren",false);
//        Human arpit=new Human(23,"arpit",true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main1 test1=new Main1("Naren");
        Main1 test2=new Main1("test2");
        System.out.println(Main1.name);
        System.out.println(Main1.name);
        //Static variables we access through class name
        //Both the time it prints test2
    }
}
