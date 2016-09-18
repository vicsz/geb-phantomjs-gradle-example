import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

//Default Driver
driver = { new PhantomJSDriver() }

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}