import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @BeforeEach
    void setUp () {
        main = new Main();
    }

    @Test
    @DisplayName("List with six strings")
    public void testStringList() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("4");
        list.add("15");
        list.add("8");
        list.add("9");
        list.add("6");

        assertEquals(6, list.size(), "After add size should be six");
        assertEquals("1", list.get(0), "Checking values by index");

    }
}