import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[]args){
       int[] my_array1 = {
               1789, 2035, 1899, 1456, 2013,
               1458, 2458, 1254, 1472, 2365,
               1456, 2165, 1457, 2456};
       String[] my_array2 = {
               "Java",
               "Python",
               "PHP",
               "C#",
               "C Programming",
               "C++"
       };
       // Array 1
       System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
       Arrays.sort(my_array1);
       System.out.println("Array 1 - Ordem: " + Arrays.toString(my_array1));
       // Array 2
       System.out.println("Array 2 - Original: " + Arrays.toString(my_array2));
       Arrays.sort(my_array2);
       System.out.println("Array 2 - Ordem: " + Arrays.toString(my_array2));
   }
}
