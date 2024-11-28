public class Person {
    String name= "Ayush";
    private int age=20;
    public void Intro_yourself(){
        System.out.println("helow my name is" + name+ " and age is" + age);
    }

    public Person(){
        this.name = name;
        this.age = age;
    }
    // incapsulation
    public int GetAge(){
        return age;
    }
    // using throw keyword
//    public void SetAge(int age) throws Exception{
//        if(age<0){
//            throw new Exception("Bc age -ve ni hoti");
//        }
//        this.age = age;
//    }
    // using try catch
    public void SetAge(int age) throws Exception{
        try {
            System.out.println("in try");
            if (age < 0) {
                throw new Exception("Bc age -ve ni hoti");
            }
            this.age = age;
        }catch(Exception e){
            // to handle exception
            System.out.println("In Catch");
            e.printStackTrace();
            System.out.println(e);
        }finally{
            System.out.println("in finally");
        }
    }
}


