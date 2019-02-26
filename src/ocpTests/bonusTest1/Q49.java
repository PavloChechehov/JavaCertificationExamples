package ocpTests.bonusTest1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q49 {
    public static void main(String[] args) throws IOException {
        Path path;
        path = Paths.get("Zoo.csv");
        Files.lines(path)
                .flatMap(p -> Stream.of(p.split(";"))) // j1
//                .map(s -> s.length()) // j2
                .collect(Collectors.toList())
                .forEach(System.out::println); // j3
    }
}
