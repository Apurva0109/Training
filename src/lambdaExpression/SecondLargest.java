//2. Find the 2nd biggest number in the given list of numbers
package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SecondLargest {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        System.out.print(numbers);
        System.out.println("\n\nWithout using lambda expression");
        System.out.println("Second Largest in list is "+findSecondLargest(numbers));

        System.out.println("\nUsing lambda experssion");
        Function<List<Integer>,Integer> searchSecondLargest = number ->{
            int largest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
            for(int num:numbers){
                if(num>largest){
                    secondLargest=largest;
                    largest=num;
                }
                else if(num>secondLargest){
                    secondLargest=num;
                }
            }
            return secondLargest;
        };
        System.out.println("Second Largest in list is "+searchSecondLargest.apply(numbers));
    }
    public static int findSecondLargest(List<Integer> numbers){
        int largest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        for(int num:numbers){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
}
