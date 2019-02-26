package ocpTests.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Q13 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Ad1\\IdeaProjects\\JavaCertificationExamples");
        Files.find(path, 0, (p, a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
                .collect(Collectors.toList()) // y2
                .stream() // y3
                .filter(x -> x.toString().endsWith(".csv")) // y4
                .forEach(System.out::println);
    }
}
