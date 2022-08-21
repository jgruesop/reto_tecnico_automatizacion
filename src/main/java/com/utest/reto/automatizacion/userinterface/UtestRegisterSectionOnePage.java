package com.utest.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterSectionOnePage extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target
            .the("where do we write the first name")
            .located(By.name("firstName"));

    public static final Target INPUT_LAST_NAME = Target
            .the("where do we write the last name")
            .located(By.name("lastName"));

    public static final Target INPUT_EMAIL = Target
            .the("where do we write the email")
            .located(By.name("email"));

    public static final Target INPUT_MONTH = Target
            .the("where do we write the birth month")
            .located(By.cssSelector("select#birthMonth"));

    public static final Target INPUT_DAY = Target
            .the("where do we write the birth day")
            .located(By.cssSelector("select#birthDay"));

    public static final Target INPUT_YEAR = Target
            .the("where do we write the birt year")
            .located(By.cssSelector("select#birthYear"));

    public static final Target INPUT_LANGUAGES = Target
            .the("where do we write the language(spoken)")
            .located(By.xpath("//*[contains(@class, 'ui-select-search')]"));

    public static final Target BUTTON_NEXT = Target
            .the("Click to continue to the next form")
            .located(By.xpath("//*[contains(@class, 'btn btn-blue')]"));

}
