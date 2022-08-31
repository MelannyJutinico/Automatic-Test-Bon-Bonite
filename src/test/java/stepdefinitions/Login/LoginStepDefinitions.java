package stepdefinitions.Login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Data;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.CompareDocument;
import questions.CompareHello;
import questions.ComparePassword;
import questions.CompareSuggestion;
import tasks.Login.Login;
import tasks.Register.Register;

import java.util.List;

public class LoginStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Tatiana");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the user is on the page$")
    public void thatTheUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^he enter his credentials correctly$")
    public void heEnterHisCredentialsCorrectly(List<Data>dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(data));
    }

    @Then("^the user will be logged in$")
    public void theUserWillBeLoggedIn() throws InterruptedException {
        Thread.sleep(2000);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareHello.compare()
                , Matchers.equalTo("Hola 1014856939 (¿no eres 1014856939? Cerrar sesión)")));

    }

    @When("^he enter invalid password$")
    public void heEnterInvalidPassword(List<Data>dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(data));
    }

    @Then("^the user will not be able to login$")
    public void theUserWillNotBeAbleToLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ComparePassword.compare()
                , Matchers.equalTo("Error: la contraseña que has introducido para el nombre de usuario 1014856939 no es correcta.")));
    }

    @When("^he enter nonexistent user$")
    public void heEnterNonexistentUser(List<Data>dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(data));

    }

    @Then("^print the error that the user does not exist$")
    public void printTheErrorThatTheUserDoesNotExist() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareDocument.compare()
                , Matchers.equalTo("Error: El nombre de usuario 88888888888 no está registrado en este sitio. Si no estás seguro de tu nombre de usuario, prueba con tu dirección de correo electrónico en su lugar.")));
    }

}
