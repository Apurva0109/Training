//3. write a program to check if two strings are rotations of each other
package lambdaExpression;

import java.util.function.BiPredicate;

public class RotationOfString {
    public static void main(String[] args){
        String str1="abcd";
        String str2="cdab";
        System.out.println("Without using lambda expression");
        System.out.println("Are strings abcd and cdab are rotation of each other: "+checkRotation(str1,str2));

        BiPredicate<String,String> isRotation=(s1,s2)->{
            String str = s1.concat(s1);
            if(s1.length()==s2.length() && str.indexOf(s2)!=-1)
                return true;
            return false;
        };
        System.out.println("\nUsing lambda expression");
        System.out.print("Are strings abcd and cdab are rotation of each other: "+isRotation.test(str1,str2));
    }
    public static boolean checkRotation(String str1, String str2){

        String str = str1.concat(str1);
        if(str1.length()==str2.length() && str.indexOf(str2)!=-1)
            return true;
        return false;
    }
}
