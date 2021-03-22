package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation(){

        List<String> names = List.of("Fakhri", "Chaerul", "insan");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);

        // Names yang original tidak akan dirubah oleh stream alias Aman digunakan
        names.forEach(System.out::println);
    }
}
