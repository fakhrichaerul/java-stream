package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Fakhri");
        builder.add("Chaerul").add("Insan");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify(){
        Stream<Object> stream = Stream.builder().add("Fakhri").add("Chaerul").add("Insan").build();

        stream.forEach(System.out::println);
    }


}
