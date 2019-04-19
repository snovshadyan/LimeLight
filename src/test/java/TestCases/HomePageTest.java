package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    HomePage homepage;
    private static Logger log = LogManager.getLogger(HomePageTest.class);


    public HomePageTest(){
        super();
    }


    @BeforeMethod
    public void  setup(ITestResult result){
        homepage = new HomePage();
        log.info("Testing " + result.getMethod().getMethodName());
    }






    @Test(priority = 1, enabled = false)
    public void TitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, ""); // page does not have title to test
    }



    @Test(priority=2)
    public void HeaderTest() throws Exception{

        Assert.assertTrue(homepage.verifyHeader());

    }



    @Test(priority=3)
    public void BannerTest() throws Exception{

        Assert.assertTrue(homepage.verifyBanner());
    }


    @Test(priority = 4)
    public void H1Test() throws Exception{

        Assert.assertTrue(homepage.verifyH1Header());
    }


    @Test(priority = 5)
    public void NewJersyImgTest() throws Exception{

        Assert.assertTrue(homepage.verifyNewJersyImg());
    }


    @Test(priority = 6)
    public void LosAngelesImgTest() throws Exception{

        Assert.assertTrue(homepage.verifyLosAngelesImg());
    }


    @Test(priority = 7)
    public void SanFranciscoImgTest() throws Exception{

        Assert.assertTrue(homepage.verifySanFranciscoImg());
    }



    @Test(priority = 8)
    public void NewJerseyTest() throws Exception{
        Assert.assertTrue(homepage.verifyNewJersey());
    }


    @Test(priority = 9)
    public void LosAngelesTest() throws Exception{
        Assert.assertTrue(homepage.verifyLosAngeles());
    }


    @Test(priority = 10)
    public void SanFranciscoTest() throws Exception{
        Assert.assertTrue(homepage.verifySanFrancisco());
    }


    @Test(priority = 11)
    public void RegisterBtnTest() throws Exception{

        Assert.assertTrue(homepage.verifyRegisterBtn());
    }


    @Test(priority = 12)
    public void ComingSoonBtn1Test() throws Exception{

        Assert.assertTrue(homepage.verifyComingSoonBtn1());
    }


    @Test(priority = 13)
    public void ComingSoonBtn2Test() throws Exception{
        Assert.assertTrue(homepage.verifyComingSoonBtn2());
    }



    @Test(priority = 14)
    public void EventTest() throws Exception{

        Assert.assertEquals(homepage.verifyEvent(), "EVENT: Lorem ipsum");

    }


    @Test(priority = 15)
    public void DateTest() throws Exception{

        Assert.assertEquals(homepage.verifyDate(), "DATE: January 12, 2020");

    }


    @Test(priority = 16)
    public void LocationTest() throws Exception{

        Assert.assertEquals(homepage.verifyLocation(), "LOCATION: Lorem ipsum dolor");

    }


    @Test(priority = 17)
    public void AddressTest() throws Exception{

        Assert.assertEquals(homepage.verifyAddress(), "ADDRESS: 123 ABC St., Toronto, ON M4Y 2G9");

    }


    @Test(priority =18)
    public void FirstNameCaptionTest() throws Exception{

        Assert.assertTrue(homepage.verifyFirstNameCaption());
    }


    @Test(priority = 19)
    public void FirstNameFieldTest() throws Exception{
        Assert.assertTrue(homepage.verifyFirstNameField());
    }

    @Test(priority = 20)
    public void LastNameCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyLastNameCaption());
    }


    @Test(priority = 21)
    public void LastNameFieldTest() throws Exception{
        Assert.assertTrue(homepage.verifyLastNameField());
    }


    @Test(priority = 22)
    public void EmailCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyEmailCaption());
    }


    @Test(priority = 23)
    public void EmailFieldTest() throws Exception{
        Assert.assertTrue(homepage.verifyEmailField());
    }



    @Test(priority = 24)
    public void IntegerCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyIntegerCaption());
    }

    @Test(priority = 25)
    public void IntegerFieldTest() throws Exception{
        Assert.assertTrue(homepage.verifyIntegerField());
    }



    @Test(priority = 26)
    public void OptionCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyOptionCaption());
    }


    @Test(priority = 27)
    public void Option1Test() throws Exception{
        Assert.assertTrue(homepage.verifyOption1());
    }


    @Test(priority = 28)
    public void Option2Test() throws Exception{
        Assert.assertTrue(homepage.verifyOption2());
    }


    @Test(priority = 29)
    public void Option3Test() throws Exception{
        Assert.assertTrue(homepage.verifyOption3());
    }


    @Test(priority = 30)
    public void PickOneCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyPickOneCaption());
    }



    @Test(priority = 31)
    public void DropDownTest() throws Exception{
        Assert.assertTrue(homepage.verifyDropDown());
    }

    @Test(priority = 32)
    public void AddCommentCaptionTest() throws Exception{
        Assert.assertTrue(homepage.verifyAddCommentCaption());
    }


    @Test(priority = 33)
    public void CommentFieldTest() throws Exception{
        Assert.assertTrue(homepage.verifyCommentField());
    }


    @Test(priority = 34)
    public void DummyRegisterTest() throws Exception{
        homepage.verifydummyregister();
    }


    @Test(priority = 35)
    public void FNErrorMsgTest() throws Exception{
        Assert.assertTrue(homepage.verifyFNErrorMsg());
    }

    @Test(priority = 36)
    public void LNErrorMsgTest() throws Exception{
        Assert.assertTrue(homepage.verifyLNErrorMsg());
    }


    @Test(priority = 37)
    public void EmailErrorMsgTest() throws Exception{
        Assert.assertTrue(homepage.verifyEmailErrorMsg());
    }


    @Test(priority = 38)
    public void CheckboxTest() throws Exception{

        Assert.assertTrue(homepage.verifyCheckbox());
    }


    @Test(priority = 39)
    public void InvalidEmailErrorMsgTest() throws Exception{
        Assert.assertTrue(homepage.verifyInvalidEmailErrorMsg());
    }


    @Test(priority = 40)
    public void CorrectSignUpTest() throws Exception{
        Assert.assertTrue(homepage.verifyCorrectSignUp());
    }


    @AfterMethod
    public void getResults(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            Utils.captureScreenshot(driver, result.getMethod().getMethodName() );
            log.info("Test: " + result.getMethod().getMethodName() + " == Failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            log.info("Test: " + result.getMethod().getMethodName() + " == Passed");
        } else if (result.getStatus() == ITestResult.SKIP){
            log.info("Test: " + result.getMethod().getMethodName() + " == Skipped");

        }
    }

}
