package Inheritance;

public class Boxcustom extends Box {
    int weight;
    Boxcustom(){
        super();
        this.weight=-1;
    }
    Boxcustom(int l,int b,int h,int weight){
        super(l,b,h);//super keyword is used to intialize members of Parent class
        this.weight=weight;
    }

}
