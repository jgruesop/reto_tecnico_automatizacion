package com.utest.reto.automatizacion.tasks;

import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterSectionFour implements Task {

    private final String password;
    private final String confirmPassword;

    public RegisterSectionFour(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static RegisterSectionFour the(String password, String confirmPassword) {
        return Tasks.instrumented(RegisterSectionFour.class, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(UtestRegisterSectionFourPage.INPUT_PASS),
                Enter.theValue(confirmPassword).into(UtestRegisterSectionFourPage.INPUT_CONFIRM_PASS),
                Click.on(UtestRegisterSectionFourPage.CHECKBOX_TERMS),
                Click.on(UtestRegisterSectionFourPage.CHECKBOX_PRIVACY),
                Click.on(UtestRegisterSectionFourPage.BUTTON_END)
        );
    }
}
