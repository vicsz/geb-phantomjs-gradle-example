import org.junit.Test
import geb.Browser

public class WikipediaExample {

    @Test
    public void wikipediaNavigationTest() {

        Browser.drive {
            go "http://www.wikipedia.org"

            $("input", name: "search").value("test")

            $("button", type: "submit").click()

            assert title == "Test - Wikipedia, the free encyclopedia"
        }
    }
}