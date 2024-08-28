import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Specify file paths
        String filePathRead = "input.txt";
        String filePathWrite = "output.txt";

        // Write to a file
        writeToFile(filePathWrite, "Hello, this is a sample text!");

        // Read from a file
        List<String> lines = readFromFile(filePathRead);

        // Display the content read from the file
        System.out.println("Content read from the file:");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Method to write content to a file
    private static void writeToFile(String filePath, String content) {
        try {
            Path path = Paths.get(filePath);
            Files.write(path, content.getBytes());
            System.out.println("Content written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static List<String> readFromFile(String filePath) {
        List<String> lines = null;
        try {
            Path path = Paths.get(filePath);
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
