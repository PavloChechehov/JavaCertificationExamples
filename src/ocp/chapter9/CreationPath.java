package ocp.chapter9;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class CreationPath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Zoo.csv");

        try {
            final List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path1 = FileSystems.getDefault().getPath("/Ad");
        Files.lines(path).forEach(System.out::println);

        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Is path a directory? " + data.isDirectory());
        System.out.println("Is path a regular file? " + data.isRegularFile());
        System.out.println("Is path a symbolic link? " + data.isSymbolicLink());
        System.out.println("Path not a file, directory, nor symbolic link? " +
                data.isOther());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Creation date/time: " + data.creationTime());
        System.out.println("Last modified date/time: " + data.lastModifiedTime());
        System.out.println("Last accessed date/time: " + data.lastAccessTime());
        System.out.println("Unique file identifier (if available): " +
                data.fileKey());

    }
}
