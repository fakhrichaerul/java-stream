package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTest {

    @Test
    void testParallelStream(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> parallelStream = numbers.stream().parallel(); // Process Parallel

        parallelStream.forEach(
                number-> System.out.println("Thread " + Thread.currentThread().getName() + " : " + number)
        );
    }
}
