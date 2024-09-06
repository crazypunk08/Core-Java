package Static_Variables;

public class Human {
    //Now we are creating members of the class
    int age;
    String name;
    boolean married;
    static long population;
    //static variables are associated with class and not the objects

   public Human(int age,String name,boolean married){
        this.age=age;
        this.name=name;
        this.married=married;
        Human.population+=1;//This will increment the value of population from the class
    }

}
