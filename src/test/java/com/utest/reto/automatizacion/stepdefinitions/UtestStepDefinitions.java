package com.utest.reto.automatizacion.stepdefinitions;

import com.utest.reto.automatizacion.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.attribute.AnnotationAppender;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Than Jhon wants to register on the Utest Community$")
    public void thanJhonWantsToRegisterOnTheUtestCommunity() {
        OnStage.theActorCalled("Jhon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he registers to the utest community he can count on the support of experienced$")
    public void heRegistersToTheUtestCommunityHeCanCountOnTheSupportOfExperienced() {

    }

    @Then("^he can register to the utest community\\.$")
    public void heCanRegisterToTheUtestCommunity() {

    }
}
