package com.utest.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterSectionTwoPage extends PageObject {

    public static final Target INPUT_CITY = Target
            .the("where do we write the city")
            .located(By.id("city"));

    public static final Target SELECT_CITY = Target
            .the("where do we write the city")
            .located(By.xpath("(//span[contains(@class,'pac-matched')])[1]"));

    public static final Target INPUT_ZIP_CODE = Target
            .the("where do we write the zip code")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target
            .the("where do we write the country")
            .located(By.xpath("//input[contains(@placeholder,'Select a country')]"));

    public static final Target BUTTON_NEXT = Target
            .the("Click to continue to the next form")
            .located(By.xpath("//*[contains(@class, 'btn btn-blue')]"));

}
