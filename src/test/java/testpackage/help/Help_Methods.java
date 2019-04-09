package testpackage.help;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class Help_Methods extends PageObject {

    private static final Help_Methods INSTANCE = new Help_Methods();

    /*
    Данный класс позволит заново не переписывать все методы, а вызывать их отсюда,
    достаточно подставить переменную xPath, которую мы объявляем в классах Page.

    Для того, чтобы было возможно обращаться к методам из этого класса в других,
    внутри нужного нам класса необходимо прописать следующую конструкцию:

    private static final Help_Methods help = Help_Methods.getInstance();

    Где help - является переменной, которую можно назвать как угодно,
    она будет распространятся только внутри класса, в котором написана
    и для вызова метода необходимо внутри созданного метода прописать следущее:

    public void Verify_Address_Button (){
        help.Check_Visible_Element(Address_Page);}

    В примере выше, мы создаем метод в классе, обращаемся к help,
    который подтягивает методы из класса Help_Methods.class, через точку выбираем нужный метод
    например Check_Visible_Element, для того, чтобы кликнуть по элементу.
    В скобках вызванного метода вставить перменную содержащую xPath, например Address_Page,
    которой соответсвует запись:

    private By Address_Page = By.xpath("//a[text()='Адреса']");

    Так как java достаточно умный язык, он будет показывать допустимые методы при написании тестов
     */

    private Help_Methods() {
    }

    public static Help_Methods getInstance() {
        return INSTANCE;
    }

    /*
    Чтобы описать унифицированный метод, необходимо в него добавить переменную, как указано на примере ниже:

        public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();}

    Так как язык java является строго наследуемым, необходимо точно укзывать тип переменной,
    которую мы будем передавать в метод.

    - By - переменная типа xPath
    - String - строковое значение, содержащее текст
    и так далее

    Тип переменной указывается после наименования метода, например Click_Method, в круглых скобках (By test), где:

    By - тип передаваемой переменной
    test - имя переменной

    Переменная указывается внутри необходимого метода, например find(test).

    Наименование перменных можно указвыать одинаковым для нескольких методов, например:

        public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();}

        public void Check_Visible_Element(By test) {
        Assertions.assertThat(find(test).isVisible());}

     Как видно из приведенных выше примеров, в каждом методе есть перменная test,
     но так как они реализованы в разных методах, то программа/автотесты, воспринимает их как уникальные.
    */


    public void Click_Method(By test) { //Метод клика по элементу
        find(test).waitUntilClickable().click();
    }

    //public void Random_RUS_Text(By test, String test1) {find(test).toString();}

    public void Check_Enabled_Element(By test) {
        Assertions.assertThat(find(test).isEnabled());
    }


   /*
    public void Click_On_All_Elements(By Xpath_Massive, By Button_Click, By Check_City, String Check_Text, By City, By Another, By Moscow) {//, By test2
        List<WebElementFacade> massive = findAll(Xpath_Massive);
        for (int i = 0; i <massive.size()-1; i++) {
            massive = findAll(Xpath_Massive);
            massive.get(i).waitUntilVisible();
            massive.get(i).click();
            Click_Method(Button_Click);

        if (Assertions.assertThat(find(Check_City).getText()).isEqualTo(Check_Text)){
            Change_City(City, Another, Moscow);
            Click_Method(Button_Click);
        }


        }
    }

     */
    public void Verify_Text(By test, String test1) {Assertions.assertThat(find(test).getText()).isEqualTo(test1);} //""
    
    public void Check_Visible_Element(By test) {
        Assertions.assertThat(find(test).isVisible());
    }

    public void Enter_Text(By test, String test1) {find(test).sendKeys(test1);}

    public void Returne_to_Prv_Page(By test){
        String Returne = Keys.chord(Keys.LEFT_ALT, Keys.ARROW_LEFT);
        find(test).sendKeys(Returne);
    }

    public void getSlow(){ //Притормаживает выполнение на 1 секунду
        try {
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

