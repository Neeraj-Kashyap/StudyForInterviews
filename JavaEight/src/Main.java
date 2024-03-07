import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Print Even number
        List<Integer> list = Arrays.asList(1,2,43,54,24,28,98,93,53,43);
        System.out.println("Print Even numbers:");
        list.stream().filter(n -> n%2==0).forEach(System.out::println);

        // Print Odd Numbers
        System.out.println("Print Odd numbers:");
        list.stream().filter(n->n%2!=0).forEach(System.out::println);

        // Sum of the numbers of the list
        System.out.println("Sum of the numbers:"+list.stream().collect(Collectors.summingInt(Integer::intValue)));

        System.out.println("Print alternate numbers:"); // wrong
        //list.stream().filter(n-> list.get(n)%2==0).skip(2).forEach(System.out::println);






    }
}