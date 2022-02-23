//6. Use Comparator interface to sort given list of Employees in the alphabetic order of their name
package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfEmployees {
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("A"));
        employeeList.add(new Employee("D"));
        employeeList.add(new Employee("Z"));
        employeeList.add(new Employee("B"));
        System.out.println(employeeList);
        System.out.println("Without using lambda expression");
        Collections.sort(employeeList, new MyComparatorSortEmployee());
        System.out.println(employeeList);

        ArrayList<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee("A"));
        employeeList1.add(new Employee("D"));
        employeeList1.add(new Employee("C"));
        employeeList1.add(new Employee("B"));
        System.out.println("\n"+employeeList1);
        System.out.println("Using lambda expression");
        Collections.sort(employeeList1,(o1,o2)->o1.getName().compareTo(o2.getName()));
        System.out.println(employeeList1);
    }
}
class MyComparatorSortEmployee implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
