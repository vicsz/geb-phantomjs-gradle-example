import org.junit.Test
import geb.Browser

public class FlightNetworkExample {

    @Test
    public void searchTest() {

        Browser.drive {
            go() // goto baseUrl defined in GebConfig.groovy

            $("input", name: "gateway_departure").value("YYC")
            $("input", name: "gateway_return").value("YYZ")

            $("input", id: "btnsubmit").click()

            waitFor(10) { //Wait for search
                $("td", class: "table_blue_title").text() == "Flight Search Results"
            }

            assert title == "Book your flight to Toronto, ON, Canada"
        }
    }
}