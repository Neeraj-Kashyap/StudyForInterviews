import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBegineer {

    /*
        Beginner Level:
        Stream programs
     */

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(12);
        list.add(16);
        list.add(20);

        // Program to filter a list of integers and print only even numbers.
        List  even = list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);

        // Program to find the sum of all elements in a list of integers.
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        // another solution
        // int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: "+sum);

        //Program to convert a list of strings to uppercase.
        List<String> names = new ArrayList<>();
        names.add("neeraj");
        names.add("kashyap");
        names.add("hah");
        names.add("near");
        names.add("alpha");

        //names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("UpperCase: "+names.stream().map(c -> c.toUpperCase()).collect(Collectors.toList()));


        // Program to find the maximum element in a list of integers.
        //System.out.println(list.stream().sorted().skip(list.size()-1).findFirst().get()); // this is also correct
        System.out.println(list.stream().mapToInt(Integer::intValue).max().orElseThrow());

        // for second max
        list.stream().sorted((a, b) -> b - a).skip(1).findFirst().orElseThrow();


        //Program to remove duplicate elements from a list.
        // for integers and String it will work

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        // another approach
        // Set<String> uniqueStrings = new HashSet<>(strings);
        // print the uniqueString, it will work





    }
}