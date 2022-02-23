//8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
package lambdaExpression;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSetOfEmployees {
    public static void main(String[] args){
        TreeSet<Employee> employeeList = new TreeSet<>(new MyComparatorTreeSetSortEmployee());
        employeeList.add(new Employee("A"));
        employeeList.add(new Employee("D"));
        employeeList.add(new Employee("Z"));
        employeeList.add(new Employee("B"));
        System.out.println("Without using lambda expression");
        System.out.println(employeeList);

        TreeSet<Employee> employeeList1 = new TreeSet<>((o1,o2)->o1.getName().compareTo(o2.getName()));
        employeeList1.add(new Employee("A"));
        employeeList1.add(new Employee("D"));
        employeeList1.add(new Employee("C"));
        employeeList1.add(new Employee("B"));
        System.out.println("Using lambda expression");
        System.out.println(employeeList1);
    }
}

class MyComparatorTreeSetSortEmployee implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
