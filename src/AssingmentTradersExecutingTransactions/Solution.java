package AssingmentTradersExecutingTransactions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args){
        //Consider years as 2011,2012,2013,2014,2015
        //Consider cities as Cambridge and Milan
        //Name of Traders AK,DA,AA,PQ

        Trader t1 = new Trader("PQ","Cambridge");
        Trader t2 = new Trader("DA","Milan");
        Trader t3 = new Trader("AA","Lyon");
        Trader t4 = new Trader("AK","Cambridge");

        Transaction transaction1= new Transaction(t1,2011,1000);
        Transaction transaction2= new Transaction(t1,2015,2000);

        Transaction transaction3= new Transaction(t2,2012,6000);
        Transaction transaction4= new Transaction(t2,2011,7000);

        Transaction transaction5= new Transaction(t3,2011,3000);
        Transaction transaction6= new Transaction(t3,2015,2000);

        Transaction transaction7= new Transaction(t4,2013,9000);
        Transaction transaction8= new Transaction(t4,2014,80000);

        List<Trader> traders = new ArrayList<>();
        traders.add(t1);
        traders.add(t2);
        traders.add(t3);
        traders.add(t4);

        System.out.println(traders);

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);
        transactions.add(transaction6);
        transactions.add(transaction7);
        transactions.add(transaction8);

        System.out.println(transactions);

        //1. Find all transactions in the year 2011 and sort them by value (small to high)
        System.out.println("\nAll transactions in the year 2011 and sort them by value (small to high)");
        /* Predicate to use
        Predicate<Transaction> checkYearTransaction = t->{
            boolean b = (t.getYear() == 2011);
            return b;
        };
        for(Transaction t: transactions){
            if(checkYearTransaction.test(t)){
                System.out.println(t);
            }
        }*/

        List<Transaction> transactionIn2011 = transactions.stream()
                .filter(m->{
                    boolean b = (m.getYear() == 2011);
                    return b;
                })
                .sorted((o1,o2)->o1.getValue()<o2.getValue()?-1:o1.getValue()>o2.getValue()?1:-1)
                .collect(Collectors.toList());

        System.out.println(transactionIn2011);

        //2. What are all the unique cities where the traders work?
        System.out.println("\nAll the unique cities where the traders work");

        //My solution
        Set<String> uniqueCities = new HashSet<>();
        for(Transaction t: transactions){
            if(!uniqueCities.contains(t.getTrader().getCity()))
                uniqueCities.add(t.getTrader().getCity());
        }
        System.out.println(uniqueCities);

        //Referenced solution
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);

        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("\nAll traders from Cambridge and sort them by name");
        List<Trader> tradersFromCambridge= transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted((tr1,tr2)->tr1.getName().compareTo(tr2.getName()))
                .collect(Collectors.toList());
        System.out.println(tradersFromCambridge);

        //4. Return a string of all traders’ names sorted alphabetically.
        System.out.println("\nAll names sorted alphabetically");
        List<String> names = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);

        //5. Are any traders based in Milan?
        System.out.print("\nAre any traders based in Milan? ");
        List<Trader> milanBased = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Milan"))
                .collect(Collectors.toList());

        if(milanBased.size()!=0)
            System.out.println("yes");
        else System.out.println("no");

        //6. Print all transactions’ values from the traders living in Cambridge.
        System.out.println("\nAll transactions’ values from the traders living in Cambridge");
        List<Transaction> transactions1 = transactions.stream()
                .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toList());

        System.out.println(transactions1);

        //7. What’s the highest value of all the transactions?
        System.out.println("\nHighest value of all the transactions");
        Transaction highestValue= transactions.stream()
                .max((o1,o2)->o1.getValue()<o2.getValue()?-1:o1.getValue()>o2.getValue()?1:-1)
                .get();
        System.out.println(highestValue.getValue());

    }
}
