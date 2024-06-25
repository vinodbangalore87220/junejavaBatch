package Collectionframework;

import java.util.Objects;

public class Employee implements Comparable{
    String id;
    String name;
    Integer mobileNo;

    public Employee(String id, String name, Integer mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(mobileNo, employee.mobileNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobileNo);
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        return this.id.compareTo(e.getId());
    }
}
