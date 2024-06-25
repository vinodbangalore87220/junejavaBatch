package Collectionframework;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        Employee E4 =new Employee("432443","Rakesh",654789987);
        Employee E1 =new Employee("1234","Rohan",456789987);
        Employee E2 =new Employee("123443","Amit",333789987);
        Employee E3 =new Employee("432443","Rakesh",654789987);

//        List<Employee> arrList= new ArrayList<>();
//        arrList.add(E1);
//        arrList.add(E2);
//        arrList.add(E3);
//        arrList.add(E4);
//        System.out.println(arrList);
//        System.out.println(arrList.get(1));
//
        List<Employee> linkList= new LinkedList<>();
        linkList.add(E1);
        linkList.add(E2);
        linkList.add(E3);
        linkList.add(E4);
       // System.out.println(linkList);

//        Set<Employee> hashList= new HashSet<>();
//        hashList.add(E1);
//        hashList.add(E2);
//        hashList.add(E3);
//        hashList.add(E4);
//        System.out.println(hashList);

//        Set<Employee> hashList= new TreeSet<>();
//        hashList.add(E1);
//        hashList.add(E2);
//        hashList.add(E3);
//        hashList.add(E4);
//        System.out.println(hashList);

        Collections.sort(linkList,new EmployeeComparator());
        System.out.println(linkList);



    }
}
