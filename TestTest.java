import static org.junit.Assert.*;
import org.junit.*;

public class TestTest {
    @Test
    public void testNot() {
        assertEquals(false, Testing.not(false));
    }
}
