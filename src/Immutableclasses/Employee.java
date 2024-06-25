package Immutableclasses;

import java.util.Collections;
import java.util.List;

public  final class Employee {
    private final String name;
    private final String city;
    private final String mobile;

    private final List<String> address;

    public Employee(String name, String city, String mobile, List<String> address, List<String> address1) {
        this.name = name;
        this.city = city;
        this.mobile = mobile;
        this.address = address1;
        Collections.unmodifiableList(address);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }
}
