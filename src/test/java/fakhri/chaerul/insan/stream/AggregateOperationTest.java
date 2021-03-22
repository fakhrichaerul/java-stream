package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi", "Zozo").stream()
                .max(Comparator.naturalOrder()) //Mencari Inisial ter-ujung
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi", "Zozo").stream()
                .min(Comparator.naturalOrder()) //Mencari Inisial ter-ujung
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi", "Zozo", "Zaza").stream()
                .count();
        System.out.println(count); //Menghitung jumlah element
    }

    @Test
    void testSum() {
        Integer result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        // 0 = initial
        // 1. value=0 item=1 = 1
        // 2. value=1 item=2 = 3
        // 3. value=3 item=3 = 6
        // 4. value=6 item=4 = 10
        // 5. value=10 item=5 = 15

        System.out.println(result);
    }

    @Test
    void testFactorial() {
        Integer factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        // 1 = initial
        // 1. value=1 item=1 = 1
        // 2. value=1 item=2 = 2
        // 3. value=2 item=3 = 6
        // 4. value=6 item=4 = 24
        // 5. value=24 item=5 = 120

        System.out.println(factorial);
    }

}
