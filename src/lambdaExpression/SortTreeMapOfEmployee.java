//10. Create a TreeMap that sorts the given set of employees in descending order of their name
package lambdaExpression;

import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMapOfEmployee {
    public static void main(String[] args){
        TreeMap<Employee,Integer> employeeTreeMap = new TreeMap<>(new MyTreeMapOfEmployeeComparator());
        employeeTreeMap.put(new Employee("D"),1);
        employeeTreeMap.put(new Employee("B"),2);
        employeeTreeMap.put(new Employee("C"),3);
        employeeTreeMap.put(new Employee("A"),4);
        System.out.println(employeeTreeMap);
    }
}
class MyTreeMapOfEmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
