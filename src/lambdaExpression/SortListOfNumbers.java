//5. Use Comparator interface to sort given list of numbers in reverse order
package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.print(numbers);
        System.out.println("\nWithout using lambda expression");
        Collections.sort(numbers,new MyComparator());
        System.out.println("Sorted list "+numbers);

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(50);
        numbers1.add(20);
        numbers1.add(15);
        System.out.println("\n"+numbers1);
        System.out.println("Using lambda expression");
        Collections.sort(numbers1,(o1,o2)->(o1>o2)?-1:(o2>o1)?1:0);
        System.out.println("Sorted list "+numbers1);
    }
}
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o2>o1)?1:0;
    }
}
