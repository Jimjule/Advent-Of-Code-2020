import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @Test
    public void exampleNumbers() throws IOException {
        Day1 day1 = new Day1("day1test.txt");
        assertEquals(514579, day1.main());
    }

    @Test
    public void actualNumbers() throws IOException {
        Day1 day1 = new Day1("day1input.txt");
            assertEquals(1020036, day1.main());
    }
}
