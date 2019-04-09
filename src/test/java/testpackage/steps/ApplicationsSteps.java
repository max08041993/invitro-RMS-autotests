package testpackage.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import testpackage.pages.ApplicationsPage;

public class ApplicationsSteps {
    ApplicationsPage page;

    @Given("Открыть главную страницу РМС")
    public void openPage() {
        page.open();
    }

//    @Test
//    public void receiptDateFieldIncorrectDateFormat() {
//
//        page.inputIntoReceiptDateField("99999999");
//
//        page.clickSubmitButton();
//
//        Thread.sleep(3000);
//
//        String firstMsg = page.getAlert().getText();
//
//        page.getAlert().accept();
//
//        Thread.sleep(3000);
//        String secondMsg = page.getAlert().getText();
//
//        page.getAlert().accept();
//
//        Assert.assertEquals("The year is invalid.", firstMsg);
//
//        Assert.assertEquals("Invalid Receipt Date format.", secondMsg);
//
//    }

    @When("Ввести логин авторизации")
    public void sendSUsername(){
        page.sendSUsername();
    }

    @When("Ввести пароль авторизации")
    public void sendSPassword(){
        page.sendSPassword();
    }

    @When("Нажать Ок")
    public void sendSContinue(){
        page.sendSContinue();
    }

    @When("Перейти на страницу Заявки")
        public void clickZayavki(){
            page.clickZayavki();
    }

    @When("Ввести номер ИЛН 750217096052")
        public void inputILN(){
            page.inputILN();
    }

    @When("Кликнуть по поиску")
        public void clickPoisk(){
            page.clickPoisk();
    }

    @When("Перейти в Доставки")
        public void clickDostavki(){
            page.clickDostavki();
    }

    @When("Клик на Глаз")
        public void clickGlaz(){
            page.clickGlaz();
    }

    @When("Нажать на Email")
        public void clickEmail(){
            page.clickEmail();
    }

}
