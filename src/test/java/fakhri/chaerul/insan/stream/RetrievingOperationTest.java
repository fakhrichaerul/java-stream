package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Fakhri", "Chaerul", "Insan").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Fakhri", "Chaerul", "Insan").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Fakhri", "Fachri", "Budi", "Susi").stream()
                //Ketika kondisi sudah tidak true maka yang dibelakangnya tidak akan diambil
                .takeWhile(name -> name.length() >= 5 )
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Fakhri", "Fachri", "Budi", "Susi").stream()
                .dropWhile(name -> name.length() >= 5 )
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Fachri", "Fakhri", "Budi", "Susi").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Chaerul", "Fakhri", "Budi", "Susi").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

}
