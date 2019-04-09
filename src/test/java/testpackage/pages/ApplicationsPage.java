package testpackage.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testpackage.help.Help_Methods;

@DefaultUrl("http://rms.invitro.ru:40506/")

public class ApplicationsPage extends PageObject {

    private static final Help_Methods help = Help_Methods.getInstance();

    private By Zayavki = By.xpath("//a[@href='/Requisitions/RequisitionRms']"); // Заявки

    private By ILN = By.xpath("//div[@class='col-md-6 col-sm-6'][1]/div[1]/input");//Поле ввода ИЛН

    private By Poisk = By.xpath("//button[@id='btnPatientSearch']");//Кнопка поиска

    private By Dostavki = By.xpath("//a[@href='#byDeliveryTab']");//Доставки

    private By Glaz = By.xpath("//a[@class='manual-delivery-button']");//Глаз

    private By Email = By.xpath("//a[@role='button'][contains(text(),'Email')]");//Email

    /////////////////////////////////////////

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
