package com.utest.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestAccessPage extends PageObject {

    public static final Target ACCESS_BUTTON = Target
            .the("button to access the registration form")
            .located(By.xpath("//*[contains(text(),'Join Today')]"));
}
