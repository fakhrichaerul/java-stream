package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline(){
        List<String> list = List.of("Fakhri", "Chaerul", "Insan");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);

    }
}
