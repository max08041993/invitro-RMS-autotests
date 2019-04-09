package testpackage.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testpackage.pages.ApplicationsPage;

public class ApplicationsStaps {
    ApplicationsPage page;

    @Given("Открыть главную страницу РМС")
    public void openPage() {
        page.open();
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
