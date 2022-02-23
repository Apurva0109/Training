//9. Create a TreeMap that sorts the given set of values in decending order
package lambdaExpression;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortTreeMapOfNumbers {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> numbers=new TreeMap<>(new MyComparatorTreeSet());
        numbers.put(1,100);
        numbers.put(3,200);
        numbers.put(7,300);
        numbers.put(5,400);
        System.out.println("\nWithout using lambda expression");
        System.out.println("Sorted Map "+numbers);

        TreeMap<Integer,Integer> numbers1=new TreeMap<>((o1,o2)->(o1>o2)?-1:(o2>o1)?1:0);
        numbers1.put(1,600);
        numbers1.put(3,900);
        numbers1.put(6,1000);
        numbers1.put(5,1200);
        System.out.println("Using lambda expression");
        System.out.println("Sorted Map "+numbers1);
    }
}

class MyComparatorTreeMap implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o2>o1)?1:0;
    }
}