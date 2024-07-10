package Inheritance;

class A{

    void Add(int a , int b){
        System.out.println(a+b); 
    }
}
class B extends A{
    void Sub(int a, int b){
        System.out.println(a-b);
    }
}

public class MultiInheritance extends B {
    void multi(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        MultiInheritance m = new MultiInheritance();
        m.Add(10, 20);
        m.Sub(20, 10);
        m.multi(10, 20);
    }
}
