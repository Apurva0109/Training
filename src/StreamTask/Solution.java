package StreamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args){
        Product tv = new Product("TV",60000,"electronics","A");
        Product fridge = new Product("Fridge",20000,"electronics","A");
        Product mobile = new Product("Mobile",40000,"electronics","A");
        Product charger = new Product("Charger",900,"electronics","A");
        Product soap = new Product("Soap",300,"non-electronics","A");
        Product comb = new Product("Comb",100,"non-electronics","A");

        List<Product> products = new ArrayList<>();
        products.add(tv);
        products.add(fridge);
        products.add(mobile);
        products.add(charger);
        products.add(soap);
        products.add(comb);

        Predicate<Product> over1000 = product -> product.getPrice()>1000;
        Predicate<Product> electronicsCategory = product -> product.getCategory().equals("electronics");
        Predicate<Product> electronicsProductOver1000 = over1000.and(electronicsCategory);

        //1. From the given list of the products get all the products with price > 1000/-
        System.out.println("All products with price > 1000");
        List<Product> productsOver1000 = products.stream()
                .filter(over1000)
                .collect(Collectors.toList());

        System.out.println(productsOver1000);

        //2. From the given list of the products get all the products from electronics category.
        System.out.println("\nAll the products from electronics category.");
        List<Product> electronicProducts=products.stream()
                .filter(electronicsCategory)
                .collect(Collectors.toList());
        System.out.println(electronicProducts);

       //3. From the given list of the products get all the products with price> 1000/- and from electronics category.
        //Change the name of the result list into CAP letters before printing.
        System.out.println("\nAll the products with price> 1000/- and from electronics category");
        List<Product> electronicProdOver1000 = productsOver1000.stream()
                .filter(electronicsProductOver1000)
                .collect(Collectors.toList());
        System.out.println(electronicProdOver1000);

        System.out.println("\nName of products with price> 1000/- and from electronics category");
        List<String> nameOfElectronics = electronicProdOver1000.stream()
                .map(product -> product.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(nameOfElectronics);

        //4. Calculate the count of all electronic products in the given list of products.
        System.out.println("\nCount all electronic products in the given list of products");
        Long noOfElectronicProduct=products.stream()
                .filter(electronicsCategory)
                .count();
        System.out.println(noOfElectronicProduct);

    }
}
