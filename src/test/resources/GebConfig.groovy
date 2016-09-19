import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

//Default Driver
driver = { new PhantomJSDriver() }


baseUrl = "http://www.flightnetwork.com"

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}