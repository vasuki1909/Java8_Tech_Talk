package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Streams are wrappers around a data source, allowing us to operate with that data source making bulk processing
convenient and fast.
it is not a data structure and does not store data, it only takes input from Collections, Arrays and IO channel
and perform actions such as filtering , matching, mapping on the stored data.
Collection can modify the source , stream do not source
external iteration using loops n internal iteration behind
*/



public class Test {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,55,6,76);
        Stream<Integer> integerStream = values.stream();
        integerStream.forEach(System.out::println);



        Stream<String> stringStream= Stream.of("abc","bse","dsds");
        stringStream.forEach(s -> System.out.println());


        //Intermediate operation:
        //Intermediate operations return the stream itself so you can chain multiple methods calls in a row.
        //1. map and collect
        List newValues =values.stream().map(x->x+1).collect(Collectors.toList());
        System.out.println(newValues);
        System.out.println("===============");

        //2. Filter operation
       List filterValues= values.stream().filter(x-> x>20).collect(Collectors.toList());
        System.out.println(filterValues);
        System.out.println("====================");


        // Sorted operation
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result = (List) names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

    }
}
