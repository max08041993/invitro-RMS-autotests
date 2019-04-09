package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testpackage.help.Help_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

@DefaultUrl("http://10.10.10.222:50505/")

public class ApplicationsPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();

    private By SUsername = By.name("login_username");
    private By SPassword = By.name("login_password");
    private By SContinue = By.name("login");

    @FindBy (xpath = "//a[@href='/Requisitions/RequisitionRms']")
            WebElement Zayavki; // Заявки

    @FindBy (xpath = "//div[@class='col-md-6 col-sm-6'][1]/div[1]/input")
        WebElement ILN;//Поле ввода ИЛН

    @FindBy (xpath = "//button[@id='btnPatientSearch']")
    WebElement Poisk;//Кнопка поиска

    @FindBy (xpath = "//a[@href='#byDeliveryTab']")
    WebElement Dostavki;//Доставки

    @FindBy (xpath = "//a[@class='manual-delivery-button']")
    WebElement Glaz;//Глаз

    @FindBy (xpath = "//a[@role='button'][contains(text(),'Email')]")
    WebElement Email;//Email

    /////////////////////////////////////////

    public void sendSUsername(){
        help.Enter_Text(SUsername,"vsafonov");
    }

    public void sendSPassword(){
        help.Enter_Text(SPassword,"Fje45kshs4");
    }

    public void sendSContinue(){
        help.Click_Method(SContinue);
    }

    public void clickZayavki(){
        help.Click_Method(Zayavki);
    }

    public void inputILN(){
        help.Enter_Text(ILN,"750217096052");
    }

    public void clickPoisk(){
        help.Click_Method(Poisk);
    }

    public void clickDostavki(){
        help.Click_Method(Dostavki);
    }

    public void clickGlaz(){
        help.Click_Method(Glaz);
    }

    public void clickEmail(){
        help.Click_Method(Email);
    }
}
