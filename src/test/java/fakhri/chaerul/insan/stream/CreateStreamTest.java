package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyForSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> System.out.println(data));

        Stream<String> oneStream = Stream.of("Fakhri");
        oneStream.forEach(data -> System.out.println(data));

        String data = "Chaerul";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> System.out.println(item));

    }

    @Test
    void testCreateStreamArray() {
        Stream<String> arrayStream = Stream.of("Fakhri", "Chaerul", "Insan");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Budi", "Susi", "Susanti"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Fakhri", "Chaerul", "Insan");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateStreamIterate(){
        Stream<String> stream1 = Stream.generate(()->"Fakhri belajar java");
//        stream1.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value+1);
//        iterate.forEach(System.out::println);
    }


}
