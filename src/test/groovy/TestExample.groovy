import org.junit.Test
import geb.Browser

public class TestExample {

    @Test
    public void testGeb() {

        Browser.drive {
            go "http://www.google.com"

        }
    }
}