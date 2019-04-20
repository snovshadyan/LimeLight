package Base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class TestBase {

    public static WebDriver driver;
    private static String baseURL = "http://samplewebsite.limelightplatform.com/";

    private static String ChromeDriverPath = ".\\WebDrivers\\chromedriver.exe";
    private static String FFDriverPath = ".\\WebDrivers\\geckodriver.exe";

    private static String Browser;
    private static String CT;
    public static Properties prop;
    private static long startTime;
    private static long endTime;


    private static Logger log = LogManager.getLogger(TestBase.class);


    public TestBase(){


        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/java/Config/config.properties");
            prop.load(ip);
        }	catch (FileNotFoundException e ) {
            e.printStackTrace();
        }  catch (IOException e){
            e.printStackTrace();
        }

    }

    private void setDriver(String browserType) throws Exception{

        if(browserType.equalsIgnoreCase("Chrome")) {
            Browser = "Chrome";
            driver = initChromeDriver();
        }else if (browserType.equalsIgnoreCase("Firefox")){
            Browser = "Firefox";
            driver = initFirefoxDriver();
        }

        log.info("Launching " + Browser + " browser\n");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseURL);
        Thread.sleep(1000);

    }



    private static WebDriver initChromeDriver()  {

        System.setProperty("webdriver.chrome.driver", ChromeDriverPath );
        driver = new ChromeDriver();
        return driver;
    }

    private static WebDriver initFirefoxDriver() {

        System.setProperty("webdriver.gecko.driver", FFDriverPath);
        driver = new FirefoxDriver();
        return driver;
    }


    @BeforeSuite
    public void BeforeSuite(){

        CT = Calendar.getInstance().getTime().toString();
        log.info("Starting LimeLight test " + CT + "\n");
        startTime = System.currentTimeMillis();

    }


    @Parameters({"browserType"})
    @BeforeClass
    public void initializeTestBaseSetup(@Optional("Chrome") String browserType) {

        try {
            setDriver(browserType);
        } catch (Exception e) {
            log.info("Error....." + e.getStackTrace());
        }

    }





    @AfterClass
    public void tearDown() {


        driver.quit();


    }

    @AfterSuite
    public void AfterSuite(){

        CT = Calendar.getInstance().getTime().toString();
        log.info("Finishing LimeLight test " + CT + "\n");
        endTime = System.currentTimeMillis();
        long duration = (endTime - startTime)/1000;
        log.info("Test execution took "  + duration + " Seconds");

    }


}
