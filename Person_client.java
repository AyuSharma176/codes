import java.io.IOException;

public class Person_client {
    public static void main(String[] args)throws Exception {
//        Student s = new Student();
        Person s1= new Person();
        s1.GetAge();
        s1.SetAge(20);
        s1.Intro_yourself();
    }
}
