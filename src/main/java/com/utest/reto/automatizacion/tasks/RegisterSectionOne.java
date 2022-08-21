package com.utest.reto.automatizacion.tasks;

import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterSectionOne implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;

    public RegisterSectionOne(String firstName, String lastName, String email, String month,
                              String day, String year, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
    }

    public static RegisterSectionOne the(String firstName, String lastName, String email,
                                         String month, String day, String year, String languages) {
        return Tasks.instrumented(RegisterSectionOne.class, firstName, lastName, email,
                                month, day, year, languages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(UtestRegisterSectionOnePage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(UtestRegisterSectionOnePage.INPUT_LAST_NAME),
                Enter.theValue(email).into(UtestRegisterSectionOnePage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(UtestRegisterSectionOnePage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(day).from(UtestRegisterSectionOnePage.INPUT_DAY),
                SelectFromOptions.byVisibleText(year).from(UtestRegisterSectionOnePage.INPUT_YEAR),
                Enter.theValue(languages).into(UtestRegisterSectionOnePage.INPUT_LANGUAGES),
                Click.on(UtestRegisterSectionOnePage.BUTTON_NEXT)
        );
    }

}
