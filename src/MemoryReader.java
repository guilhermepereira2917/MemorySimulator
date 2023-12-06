import java.io.*;
import java.util.List;

public class MemoryReader {
    final private String filePath;

    public MemoryReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String> parseFile() throws IOException {
        List<String> fileContents;

        try (FileReader fileReader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            fileContents = bufferedReader.lines().toList();
        }

        return fileContents;
    }
}
