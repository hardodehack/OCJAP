package java_8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_1 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        for(int i=1;i<=100;i++) arrayList.add(i);

        Stream<Integer> sequentialStream = arrayList.stream();

        Stream<Integer> parallelStream = arrayList.parallelStream();

        // Stream filter can be use to TEST Stream Element for a Specified Condition and generate a filtered list.
        sequentialStream.filter( i -> i > 90).forEach( p -> System.out.print(p+" "));

        System.out.println();

        //Stream map() example: We can use map() to apply functions to an stream.
        Stream<String> names = Stream.of("aBc", "d", "ef");
        names.map( i -> i.toUpperCase()).forEach(i-> System.out.print(i+" "));

        Stream<String> stringStream = Stream.of("Hardik","Parth","Popat","Kishanio","Prakashia");

        // Easiest Way for multiple operations.
        stringStream.filter(s -> s.length() > 6).filter( s -> s.toLowerCase().contains("h")).forEach(s -> System.out.println(s));

        //System.out.println(finalString);
    }



}
