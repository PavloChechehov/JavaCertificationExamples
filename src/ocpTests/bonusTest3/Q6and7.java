package ocpTests.bonusTest3;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q6and7 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Ad1\\IdeaProjects\\.\\JavaCertificationExamples").normalize().getRoot();
        System.out.println("path.getRoot() = " + path);

        Files.walk(path, 5, FileVisitOption.FOLLOW_LINKS) // b1
                .filter(p -> p.resolve(p).getFileName().toString().endsWith(".csv")) // b2
//                .filter(p -> p.getNameCount(0)>4) // b3
                .forEach(p -> {
                    try {
                        System.out.println(p.toRealPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
