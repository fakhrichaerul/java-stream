package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void TestMap(){
        List.of("Fakhri", "chaerul", "Insan").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void TestFlatMap(){
        List.of("Fakhri", "chaerul", "Insan").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value))
                .forEach(length -> System.out.println(length));
    }
}
