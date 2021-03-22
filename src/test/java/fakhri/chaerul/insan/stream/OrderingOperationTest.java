package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted(){
        List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi").stream()
                .sorted()
                .forEach(System.out::println); //ASCENDING
    }

    @Test
    void testSortedWithComparator(){
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Fakhri", "Chaerul", "Insan", "Budi", "Susi").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println); //DESCENDING
    }
}
