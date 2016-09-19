#Instructions

## Quick Start

1. Ensure current JDK is installed (nothing else is required -- other dependencies will automatically download )
2. To run tests with Headless Browser (PhantomJS) run: ./gradlew testPhantomJs
3. To tun tests with Chrome run: ./gradlew testChrome

## Debugging and running test individually in IDE's

Default WebDriver (Chrome or PhantomJs) is configure in the GebConfig.groovy file in resources.

Example for running individual tests from the commandline: gradle testPhantomJs -Dtest.single=WikipediaExample

Example of passing in a different baseURL: gradle testChrome -PbaseUrl=http://www.otherBaseUrl.com

For future reference, consider test filtering in gradle i.e. : http://stackoverflow.com/questions/22505533/how-to-run-a-one-test-class-only-on-gradle