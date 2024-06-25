package generics;

public class Genericsmain {
    public static void main (String[] args)
    {
        Test <Integer, String> obj =  new Test<Integer, String>(15,"raman");

        obj.print();
        System.out.println(Thread.currentThread().getName());
    }
}
