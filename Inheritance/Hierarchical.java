package Inheritance;

class AA{
    public int multi(int a, int b){
        System.out.println(a*b);
        return a*b;
    }
}

class BB extends AA{
    public int div(int a, int b){
        System.out.println(a/b);
        return a/b;
    }
}
class CC extends AA{
    public int add(int a, int b){
        System.out.println(a+b);
        return a+b;
   }
}

public class Hierarchical{


public static void main(String[] args) {
    int m,n;
    BB obb = new BB();
    CC obd = new CC();

    m = obb.multi(2, 3);
    n=  obd.multi(4, 3);
    obd.add(m,n);

}
    
}
