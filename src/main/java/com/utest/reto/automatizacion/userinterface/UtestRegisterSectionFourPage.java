package com.utest.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterSectionFourPage extends PageObject {

    public static final Target INPUT_PASS = Target
            .the("typing the password")
            .located(By.name("password"));

    public static final Target INPUT_CONFIRM_PASS = Target
            .the("typing the confirm password")
            .located(By.name("confirmPassword"));

    public static final Target CHECKBOX_TERMS = Target
            .the("read and accept the terms")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PRIVACY = Target
            .the("read and accept the privacy and security")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_END = Target
            .the("Click to continue to the next form")
            .located(By.xpath("//*[contains(@class, 'btn btn-blue')]"));
}
