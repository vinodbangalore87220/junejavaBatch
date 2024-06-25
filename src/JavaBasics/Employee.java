package JavaBasics;

public class Employee {

    private String name;
    public String address;
    int id;
    protected static String city;

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.name = "Street";

        Employee.city = "Bangalore";

    }

    public Employee getName(Employee employee){
        System.out.println(name);
        return new Employee();
    }

}
