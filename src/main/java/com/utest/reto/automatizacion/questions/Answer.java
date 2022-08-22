package com.utest.reto.automatizacion.questions;

import com.utest.reto.automatizacion.userinterface.UtestAccessPage;
import com.utest.reto.automatizacion.userinterface.UtestCommunityPage;
import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionFourPage;
import com.utest.reto.automatizacion.userinterface.UtestRegisterSectionOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String validate = Text.of(UtestAccessPage.END_REGISTER).viewedBy(actor).asString();
        if (question.equals(validate)) {
            return true;
        }
        return false;
    }

}
