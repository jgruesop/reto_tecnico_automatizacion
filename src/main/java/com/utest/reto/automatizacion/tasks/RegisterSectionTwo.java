package com.utest.reto.automatizacion.tasks;

import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterSectionTwo implements Task {

    private String city;
    private String zipCode;
    private String country;

    public RegisterSectionTwo(String city, String zipCode, String country) {
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public static RegisterSectionTwo the(String city, String zipCode, String country) {
        return Tasks.instrumented(RegisterSectionTwo.class, city, zipCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterSectionTwoPage.SELECT_INPUT_COUNTRY),
                Enter.theValue(country).into(UtestRegisterSectionTwoPage.INPUT_COUNTRY),
                Click.on(UtestRegisterSectionTwoPage.SELECT_LIST_COUNTRY),
                Enter.theValue(city).into(UtestRegisterSectionTwoPage.INPUT_CITY),
                Click.on(UtestRegisterSectionTwoPage.SELECT_CITY),
                Enter.theValue(zipCode).into(UtestRegisterSectionTwoPage.INPUT_ZIP_CODE),
                Click.on(UtestRegisterSectionTwoPage.BUTTON_NEXT)
        );
    }
}
