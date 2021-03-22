package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Fakhri", "Chaerul", "Insan");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Fakhri", "Chaerul", "Insan");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr." +upper;
                })
                .forEach(upper -> {
                    System.out.println(upper);  //Stream object dieksekusi satu persatu
                });
    }
}
