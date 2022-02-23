//7. Create a TreeSet that sorts the given set of numbers in reverse order
package lambdaExpression;
import java.util.*;

public class SortTreeSetOfNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>(new MyComparatorTreeSet());
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.println("\nWithout using lambda expression");
        System.out.println("Sorted list "+numbers);

        TreeSet<Integer> numbers1=new TreeSet<>((o1,o2)->(o1>o2)?-1:(o2>o1)?1:0);
        numbers1.add(10);
        numbers1.add(50);
        numbers1.add(30);
        numbers1.add(15);
        System.out.println("Using lambda expression");
        System.out.println("Sorted list "+numbers1);
    }
}
class MyComparatorTreeSet implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o2>o1)?1:0;
    }
}