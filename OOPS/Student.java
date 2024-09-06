public class Student {
    Student(){
        marks=1;
        age=2;
        CGPA=1.1f;
    }
    Student(int marks,int age,float cgpa){
        //this keyword is used to differentiate between Different objects of same class
        //When constructor arguments and instance variables are same this is mandatory
        //Otherwise java will get confused between the variables as in the below case
        this.marks=marks;
        this.age=age;
        this.CGPA=cgpa;
    }
    //This constructor is used when other Object of type Student is passed
    Student(Student other){
        this.marks=other.marks;
        this.age=other.age;
        this.CGPA=other.CGPA;
    }

    int marks;
    int age;
    float CGPA;
}
