package Inheritance;
class Person1{

    String name = "Prasad";
    int age = 20;
    
    void talk(){
        System.out.println("I can Talk" + name);

    }
}
class Student extends Person1{
    int rollNo = 56;

    void coding(){
        System.out.println("Look At my code" + " and my age is"+ age);
    }

    public static void main(String[] args) {
        Student p = new Student();
        p.talk();
        p.coding();
    }
}
