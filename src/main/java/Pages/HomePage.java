package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends TestBase {




    @FindBy(xpath="//img[@src='https://s3.amazonaws.com/themes.limelightplatform.com/web/drive/logo.png']")
    WebElement Header;

    @FindBy(xpath="//img[@src='https://s3.amazonaws.com/themes.limelightplatform.com/web/wheels/banner.png']")
    WebElement Banner;


    @FindBy(xpath="//div/h3/span[text()='Lorem Ipsum Dolor Sit Amet Consectetu']")
    WebElement H1;


    @FindBy(xpath="//img[@src='https://s3.amazonaws.com/themes.limelightplatform.com/web/wheels/CITIES/IMAGE-5.png']")
    WebElement NewJersyImg;

    @FindBy(xpath="//img[@src='https://s3.amazonaws.com/themes.limelightplatform.com/web/wheels/CITIES/IMAGE-4.png']")
    WebElement LosAngelesImg;

    @FindBy(xpath="//img[@src='https://s3.amazonaws.com/themes.limelightplatform.com/web/wheels/CITIES/IMAGE-3.png']")
    WebElement SanFranciscoImg;

    @FindBy(xpath="//h4[text()='NEW JERSEY']")
    WebElement NewJersey;

    @FindBy(xpath="//h4[text()='LOS ANGELES']")
    WebElement LosAngeles;

    @FindBy(xpath = "//h4[text()='SAN FRANCISCO']")
    WebElement SanFrancisco;

    @FindBy(xpath = "//div[1]/div[2]/div/a[text()='REGISTER']")
    WebElement RegisterBtn;

    @FindBy(xpath = "//div[2]/div[2]/div/a[text()='COMING SOON']")
    WebElement ComingSoonBtn1;

    @FindBy(xpath="//div[3]/div[2]/div/a[text()='COMING SOON']")
    WebElement ComingSoonBtn2;

    @FindBy(xpath="//*[@id=\"rsvp-details\"]/div[1]/ul/li[1]")
    WebElement Event;

    @FindBy(xpath="//*[@id=\"rsvp-details\"]/div[1]/ul/li[2]")
    WebElement Date;

    @FindBy(xpath="//*[@id=\"rsvp-details\"]/div[1]/ul/li[3]")
    WebElement Location;

    @FindBy(xpath="//*[@id=\"rsvp-details\"]/div[1]/ul/li[4]")
    WebElement Address;

    @FindBy(xpath = "//h2[text()='RSVP Today']")
    WebElement RSVPToday;

    @FindBy(xpath = "//span[text()='First Name']")
    WebElement FirstNameCaption;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement FirstNameField;


    @FindBy(xpath = "//span[text()='Last Name']")
    WebElement LastNameCaption;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement LastNameField;


    @FindBy(xpath = "//span[text()='Email Address']")
    WebElement EmailCaption;

    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailField;

    @FindBy(xpath = "//label[text()='Pick an Integer']")
    WebElement IntegerCaption;

    @FindBy(xpath = "//input[@id='number']")
    WebElement IntegerField;

    @FindBy(xpath = "//label[text()='Pick zero or more options']")
    WebElement OptionCaption;

    @FindBy(xpath = "//input[@value='Op1']")
    WebElement Option1;

    @FindBy(xpath = "//input[@value='Op2']")
    WebElement Option2;

    @FindBy(xpath = "//input[@value='Op3']")
    WebElement Option3;

    @FindBy(xpath = "//label[text()='Pick One']")
    WebElement PickOneCaption;

    @FindBy(xpath = "//select[@id='dropdown']")
    WebElement DropDown;

    @FindBy(xpath = "//label[text()='Add Comment']")
    WebElement AddCommentCaption;

    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement CommentField;

    @FindBy(xpath = "//input[@id='formSubmitButton']")
    WebElement SignUpBtn;

    @FindBy(xpath="//*[@id=\"formFieldList\"]/ul/li[1]/div[4]/span")
    WebElement FNErrorMsg;

    @FindBy(xpath ="//*[@id=\"formFieldList\"]/ul/li[2]/div[4]/span")
    WebElement LNErrorMsg;

    @FindBy(xpath = "//*[@id=\"formFieldList\"]/ul/li[3]/div[4]/span")
    WebElement EmailErrorMsg;

    @FindBy(xpath = "//span[text()='Please enter a valid email address']")
    WebElement InvalidEmailErrorMsg;

    @FindBy(xpath = "//h1[text()='Thank You!']")
    WebElement ThankYou;

    @FindBy(xpath="//input[@id='check-0']")
    WebElement Checkbox0;





    public HomePage(){
        PageFactory.initElements(driver, this);
    }



    public boolean verifyHeader() throws Exception{
        Utils.HEY(Header);
        return Header.isDisplayed();
    }


    public boolean verifyBanner() throws Exception{
        Utils.HEY(Banner);
        return Banner.isDisplayed();
    }


    public boolean verifyH1Header() throws Exception{
        Utils.MoveTo(H1);
        Utils.sleep(1000);
        Utils.HEY(H1);
        return H1.isDisplayed();
    }


    public boolean verifyNewJersyImg() throws Exception{
        Utils.HEY(NewJersyImg);
        return NewJersyImg.isDisplayed();
    }


    public boolean verifyLosAngelesImg() throws Exception{
        Utils.HEY(LosAngelesImg);
        return LosAngelesImg.isDisplayed();
    }


    public boolean verifySanFranciscoImg() throws Exception{
        Utils.HEY(SanFranciscoImg);
        return SanFranciscoImg.isDisplayed();
    }



    public boolean verifyNewJersey() throws Exception{
        Utils.HEY(NewJersey);
        return NewJersey.isDisplayed();
    }


    public boolean verifyLosAngeles() throws Exception{
        Utils.HEY(LosAngeles);
        return LosAngeles.isDisplayed();
    }


    public boolean verifySanFrancisco() throws Exception{
        Utils.HEY(SanFrancisco);
        return SanFrancisco.isDisplayed();
    }



    public boolean verifyRegisterBtn() throws Exception{
        Utils.HEY(RegisterBtn);
        return RegisterBtn.isDisplayed();
    }


    public boolean verifyComingSoonBtn1() throws Exception{
        Utils.HEY(ComingSoonBtn1);
        return ComingSoonBtn1.isDisplayed();
    }


    public boolean verifyComingSoonBtn2() throws Exception{
        Utils.HEY(ComingSoonBtn2);
        return ComingSoonBtn2.isDisplayed();
    }


    public String verifyEvent() throws Exception{

        Utils.MoveTo(RSVPToday);
        Utils.HEY(Event);
        String EventTitle = Event.getText();
        return EventTitle;
    }



    public String verifyDate() throws Exception{

        Utils.HEY(Date);
        String DateText = Date.getText();
        return DateText;
    }



    public String verifyLocation() throws Exception{

        Utils.HEY(Location);
        String LocationText = Location.getText();
        return LocationText;
    }



    public String verifyAddress() throws Exception{
        Utils.HEY(Address);
        String AddressText = Address.getText();
        return AddressText;
    }


    public boolean verifyFirstNameCaption() throws Exception{
        Utils.HEY(FirstNameCaption);
        return FirstNameCaption.isDisplayed();
    }



    public boolean verifyFirstNameField() throws Exception{
        Utils.HEY(FirstNameField);
        return FirstNameField.isDisplayed();
    }


    public boolean verifyLastNameCaption() throws Exception{
        Utils.HEY(LastNameCaption);
        return LastNameCaption.isDisplayed();
    }



    public boolean verifyLastNameField() throws Exception{
        Utils.HEY(LastNameField);
        return LastNameField.isDisplayed();
    }



    public boolean verifyEmailCaption() throws Exception{
        Utils.HEY(EmailCaption);
        return EmailCaption.isDisplayed();
    }


    public boolean verifyEmailField() throws Exception{
        Utils.HEY(EmailField);
        return EmailField.isDisplayed();
    }


    public boolean verifyIntegerCaption() throws Exception{
        Utils.HEY(IntegerCaption);
        return IntegerCaption.isDisplayed();
    }


    public boolean verifyIntegerField() throws Exception{
        Utils.HEY(IntegerField);
        return IntegerField.isDisplayed();
    }


    public boolean verifyOptionCaption() throws Exception{
        Utils.HEY(OptionCaption);
        return OptionCaption.isDisplayed();
    }


    public boolean verifyOption1() throws Exception{
        Utils.HEY(Option1);
        return Option1.isDisplayed();
    }


    public boolean verifyOption2() throws Exception{
        Utils.HEY(Option2);
        return Option2.isDisplayed();
    }


    public boolean verifyOption3() throws Exception{
        Utils.HEY(Option3);
        return Option3.isDisplayed();
    }

    public boolean verifyPickOneCaption() throws Exception{
        Utils.HEY(PickOneCaption);
        return PickOneCaption.isDisplayed();
    }


    public boolean verifyDropDown() throws Exception{
        Utils.HEY(DropDown);
        return DropDown.isDisplayed();
    }



    public boolean verifyAddCommentCaption() throws Exception{
        Utils.HEY(AddCommentCaption);
        return AddCommentCaption.isDisplayed();
    }


    public boolean verifyCommentField() throws Exception{
        Utils.HEY(CommentField);
        return CommentField.isDisplayed();
    }


    public void verifydummyregister() throws Exception{

        SignUpBtn.click();
        Utils.sleep(1000);

    }


    public boolean verifyFNErrorMsg() throws Exception{

        Utils.HEY(FNErrorMsg);
        return FNErrorMsg.isDisplayed();
    }


    public boolean verifyLNErrorMsg() throws Exception{

        Utils.HEY(LNErrorMsg);
        return LNErrorMsg.isDisplayed();
    }


    public boolean verifyEmailErrorMsg() throws Exception{

        Utils.HEY(EmailErrorMsg);
        return EmailErrorMsg.isDisplayed();
    }


    public boolean verifyCheckbox() throws Exception{

        Checkbox0.click();
        Utils.sleep(500);
        return Checkbox0.isSelected();

    }


    public boolean verifyInvalidEmailErrorMsg() throws Exception{

        FirstNameField.sendKeys(prop.getProperty("FirstName"));
        LastNameField.sendKeys(prop.getProperty("LastName"));
        EmailField.sendKeys("someemail");
        SignUpBtn.click();
        Utils.WFEV(By.xpath("//span[text()='Please enter a valid email address']"));
        return InvalidEmailErrorMsg.isDisplayed();
    }


    public boolean verifyCorrectSignUp() throws Exception{

        driver.navigate().refresh();
        Utils.WFEV(By.xpath("//input[@id='firstName']"));
        FirstNameField.sendKeys(prop.getProperty("FirstName"));
        LastNameField.sendKeys(prop.getProperty("LastName"));
        EmailField.sendKeys(prop.getProperty("Email"));
        IntegerField.sendKeys("7");
        Checkbox0.click();
        Select dropdown= new Select(DropDown);
        dropdown.selectByVisibleText("Add Comment");
        CommentField.sendKeys("Please sign me up");
        SignUpBtn.click();
        Utils.WFEV(By.xpath("//h1[text()='Thank You!']"));
        return ThankYou.isDisplayed();

    }



}
