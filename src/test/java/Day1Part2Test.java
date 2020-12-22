import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Part2Test {

    @Test
    public void exampleNumbers() throws IOException {
        Day1Part2 day1Part2 = new Day1Part2("day1Part2Test.txt");
        assertEquals(241861950, day1Part2.main());
    }

    @Test
    public void actualNumbers() throws IOException {
        Day1Part2 day1Part2 = new Day1Part2("day1Input.txt");
            assertEquals(286977330, day1Part2.main());
    }
}
