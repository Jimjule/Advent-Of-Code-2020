import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1 {

    public String fileName;

    public Day1(String fileName) {
        this.fileName = fileName;
    }

    public int main() throws IOException {
        Path filePath = FileSystems.getDefault().getPath("res", fileName);
        Charset charset = StandardCharsets.UTF_8;
        List<String> numbers;
        numbers = Files.readAllLines(filePath, charset);

        int total = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (Integer.parseInt(numbers.get(i)) + Integer.parseInt(numbers.get(j)) == 2020) {
                    total = Integer.parseInt(numbers.get(i)) * Integer.parseInt(numbers.get(j));
                }
            }
        }
        return total;
    }
}
