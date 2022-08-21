package com.utest.reto.automatizacion.stepdefinitions;

import com.utest.reto.automatizacion.model.UtestSectionOneData;
import com.utest.reto.automatizacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @When("^he registers to the utest community he can count on the support of experienced$")
    public void heRegistersToTheUtestCommunityHeCanCountOnTheSupportOfExperienced(List<UtestSectionOneData> utestData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionOne
                .the(utestData.get(0).getFirstName(), utestData.get(0).getLastName(), utestData.get(0).getEmail(),
                        utestData.get(0).getMonth(), utestData.get(0).getDay(), utestData.get(0).getYear(),
                        utestData.get(0).getLanguages()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionTwo
                .the(utestData.get(0).getCity(), utestData.get(0).getZipCode(), utestData.get(0).getCountry()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionThree
                .the(utestData.get(0).getMobileDevice(), utestData.get(0).getModel(), utestData.get(0).getOperatingSystem()));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterSectionFour.the(utestData.get(0).getPassword(), utestData.get(0).getConfirmPassword()));
    }

    @Then("^he can register to the utest community\\.$")
    public void heCanRegisterToTheUtestCommunity() {

    }
}
