package com.utest.reto.automatizacion.stepdefinitions;

import com.utest.reto.automatizacion.model.UtestPersonaData;
import com.utest.reto.automatizacion.questions.Answer;
import com.utest.reto.automatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Than Jhon wants to register on the Utest Community$")
    public void thanJhonWantsToRegisterOnTheUtestCommunity() {
        OnStage.theActorCalled("Jhon").wasAbleTo(OpenUp.thePage(), (Access.OnthePage()));
    }

    @When("^he registers to the utest community he can count on the support of people experienced$")
    public void heRegistersToTheUtestCommunityHeCanCountOnTheSupportOfPeopleExperienced(List<UtestPersonaData> utestPersonaData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionOne
                .the(utestPersonaData.get(0).getFirstName(), utestPersonaData.get(0).getLastName(), utestPersonaData.get(0).getEmail(),
                        utestPersonaData.get(0).getMonth(), utestPersonaData.get(0).getDay(), utestPersonaData.get(0).getYear(),
                        utestPersonaData.get(0).getLanguages()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionTwo
                .the(utestPersonaData.get(0).getCity(), utestPersonaData.get(0).getZipCode(), utestPersonaData.get(0).getCountry()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionThree
                .the(utestPersonaData.get(0).getMobileDevice(), utestPersonaData.get(0).getModel(), utestPersonaData.get(0).getOperatingSystem()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionFour.the(utestPersonaData.get(0).getPassword(), utestPersonaData.get(0).getConfirmPassword()));
    }

    @Then("^he can register to the utest community\\.$")
    public void heCanRegisterToTheUtestCommunity(List<UtestPersonaData> utestPersonaData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestPersonaData.get(0).getQuestion())));
    }
}
