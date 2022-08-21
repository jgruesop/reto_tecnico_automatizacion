package com.utest.reto.automatizacion.tasks;

import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterSectionThree implements Task {

    private String mobileDevice;
    private String model;
    private String operatingSystem;

    public RegisterSectionThree(String mobileDevice, String model, String operatingSystem) {
        this.mobileDevice = mobileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public static RegisterSectionThree the(String mobileDevice, String model, String operatingSystem) {
        return Tasks.instrumented(RegisterSectionThree.class, mobileDevice, model, operatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterSectionThreePage.SELECT_INPUT_MOBILE),
                Enter.theValue(mobileDevice).into(UtestRegisterSectionThreePage.INPUT_MOBILE),
                Click.on(UtestRegisterSectionThreePage.SELECT_LIST_MOBILE),
                Click.on(UtestRegisterSectionThreePage.SELECT_INPUT_MODEL),
                Enter.theValue(model).into(UtestRegisterSectionThreePage.INPUT_MODEL),
                Click.on(UtestRegisterSectionThreePage.SELECT_LIST_MODEL),
                Click.on(UtestRegisterSectionThreePage.SELECT_INPUT_OS),
                Enter.theValue(operatingSystem).into(UtestRegisterSectionThreePage.INPUT_OS),
                Click.on(UtestRegisterSectionThreePage.SELECT_LIST_OS),
                Click.on(UtestRegisterSectionThreePage.BUTTON_NEXT)
        );
    }
}
