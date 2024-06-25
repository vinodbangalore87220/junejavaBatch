package polymorphism;

public class child extends parent{
    int age;
    public void print(int value){
        super.print(10);
        System.out.println("printing");
    }
}
