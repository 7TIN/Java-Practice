class Person{

    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        if (name == "Prasad" || name == "prasad"){
            this.name = name;
        }
        else{
            throw new IllegalAccessError("Unauthorized User");
        }
    }

    public void setAge(int age){
        if (age == 20){
            this.age = age;
        }
        else{
            throw new IllegalAccessError("Unautorized user");
        }
    }
    
}

class Abc{
    public static void main(String[] args) {
        int Age;
        String Name;
        Person p = new Person();
        p.setName("Prasad");
        p.setAge(20);
    
        Name = p.getName();
        Age = p.getAge();

        System.out.println("My Name is " + Name);
        System.out.println("My Age is "+ Age);
        
    }
   

} 