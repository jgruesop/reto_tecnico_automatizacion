package com.utest.reto.automatizacion.tasks;

import com.utest.reto.automatizacion.userinterface.UtestAccessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Access implements Task {
    public static Access OnthePage() {
        return Tasks.instrumented(Access.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestAccessPage.ACCESS_BUTTON));
    }
}
