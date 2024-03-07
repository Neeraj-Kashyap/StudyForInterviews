import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediate {

    /*
        Intermediate Level:
     */

    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(12);
        list.add(16);
        list.add(20);

        // Program to find the average of all elements in a list of integers.
        // use int avg  = list.stream().mapToInt(Integer::intValue).average().orElseThrow(); for integer average
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElseThrow());

        List<String> names = new ArrayList<>();
        names.add("neeraj");
        names.add("kashyap");
        names.add("hah");
        names.add("near");
        names.add("alpha");

        //Program to sort a list of strings in alphabetical order.
        System.out.println(names.stream().sorted().collect(Collectors.toList()));

        //Program to sort a list of strings in reverse order.
        System.out.println(names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));


        //Program to find the square of each element in a list of integers.
        System.out.println(list.stream().map(s1 -> s1*s1).collect(Collectors.toList()));


        List<String> namesForOrder = new ArrayList<>();
        namesForOrder.add("neeraj");
        namesForOrder.add("kremkai");
        namesForOrder.add("poland");
        namesForOrder.add("musk");
        namesForOrder.add("alpha");


        // Program to concatenate two lists and remove duplicates.

        List<String> newList = Stream.concat(names.stream(),namesForOrder.stream()).distinct().collect(Collectors.toList());
        System.out.println("newList: "+newList);

        // Program to group elements of a list by their length.
        Map<Integer,List<String>> newMap = namesForOrder.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(newMap);

        /*
            List<String> words = Arrays.asList("apple", "banana", null, "orange", "banana", null, "grape", "kiwi", "pear", null);
            Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(s -> s == null ? "null" : s, Collectors.counting()));
            System.out.println("Occurrences of words: " + wordCount);
        */

        /*
         List<String> strings = Arrays.asList("Apple", "Banana", "orange", "Grape", "Kiwi", "Pear");

            Map<Character, Long> uppercaseCounts = strings.stream()
                                                      .flatMapToInt(String::chars)
                                                      .filter(Character::isUpperCase)
                                                      .mapToObj(c -> (char) c)
                                                      .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            Map<Character, Long> lowercaseCounts = strings.stream()
                                                      .flatMapToInt(String::chars)
                                                      .filter(Character::isLowerCase)
                                                      .mapToObj(c -> (char) c)
                                                      .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            System.out.println("Uppercase counts: " + uppercaseCounts);
            System.out.println("Lowercase counts: " + lowercaseCounts);
         */
    }

}
