package Inheritance;
interface App{
    
    default void Add(int a , int b){
        System.out.println(a+b); 
    }
}
interface Bpp{
    public void print();
    default void Sub(int a, int b){
        System.out.println(a-b);
    }
}
public class Multiplee implements App,Bpp {

    public void print(){
        System.out.println("This is multiple inheritance");
    }
    public static void main(String[] args) {
        Multiplee m = new Multiplee();
        m.Add(10, 20);
        m.Sub(20, 10);
        m.print();

    }

    
}

