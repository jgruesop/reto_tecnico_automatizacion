package com.utest.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterSectionThreePage extends PageObject {

    public static final Target SELECT_MOBILE = Target
            .the("select the mobile device")
            .located(By.name("handsetMakerId"));
    public static final Target INPUT_MOBILE = Target
            .the("type the name of the mobile device")
            .located(By.xpath("(//ul[contains(@repeat,'device.id')])[2]"));

    public static final Target SELECT_MODEL = Target
            .the("select the mobile device")
            .located(By.name("handsetModelId"));
    public static final Target INPUT_MODEL = Target
            .the("type the name of the model")
            .located(By.xpath("//input[contains(@placeholder,'Select a Model')]"));

    public static final Target SELECT_OS = Target
            .the("select the mobile device")
            .located(By.name("handsetOSId"));
    public static final Target INPUT_OS = Target
            .the("type the name of the model")
            .located(By.xpath("(//input[@placeholder='Select OS'])[2]"));

    public static final Target BUTTON_NEXT = Target
            .the("Click to continue to the next form")
            .located(By.xpath("//*[contains(@class, 'btn btn-blue')]"));


}
