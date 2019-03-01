package Utilities;

import Base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;




public class Utils extends TestBase {





    public static void sleep(int Mils) throws Exception {
        Thread.sleep(Mils);
    }




    public  static void WFEV(By by) throws Exception {

        sleep(100);
        HEY(driver.findElement(by));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



    public static boolean WFENV(By by) throws Exception{

        try {
            driver.findElement(by);
            return false;

        } catch (NoSuchElementException e) {
            return true;
        }
    }



    public static void HEY(WebElement element) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px groove red'", element);
        js.executeScript("arguments[0].style.backgroundColor='#FFFF00'", element);
        sleep(50);
        js.executeScript("arguments[0].style.border=''", element);
        js.executeScript("arguments[0].style.backgroundColor=''", element);
    }


    public static void MoveTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }



    public static void Sendkey(WebElement elem, String Text){

        Actions performAct = new Actions(driver);
        performAct.sendKeys(elem, Text).build().perform();
    }




    public static void captureScreenshot(WebDriver driver,String screenshotName)
    {
        try
        {
            TakesScreenshot ts=(TakesScreenshot)driver;
            File source=ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
            System.out.println("Screenshot taken");
        }
        catch (Exception e)
        {
            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
    }



}
