import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1Part2 {

    public String fileName;

    public Day1Part2(String fileName) {
        this.fileName = fileName;
    }

    public int main() throws IOException {
        Path filePath = FileSystems.getDefault().getPath("res", fileName);
        Charset charset = StandardCharsets.UTF_8;
        List<String> numbers;
        numbers = Files.readAllLines(filePath, charset);

        int total = 0;
        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = 1; j < numbers.size() - 1; j++) {
                for (int k = 2; k < numbers.size(); k++) {
                    if (Integer.parseInt(numbers.get(i)) + Integer.parseInt(numbers.get(j)) + Integer.parseInt(numbers.get(k)) == 2020) {
                        total = Integer.parseInt(numbers.get(i)) * Integer.parseInt(numbers.get(j)) * Integer.parseInt(numbers.get(k));
                    }
                }
            }
        }
        return total;
    }
}
