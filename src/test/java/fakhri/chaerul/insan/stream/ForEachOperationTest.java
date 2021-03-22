package fakhri.chaerul.insan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("Fakhri", "Chaerul", "Insan").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper " + name);
                    String upper = name.toUpperCase();
                    System.out.println("After Change Name to Upper " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Fakhri", "Chaerul", "Insan").stream()
                .peek(name -> System.out.println("Before Change Name to Upper " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("After Change Name to Upper " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}
