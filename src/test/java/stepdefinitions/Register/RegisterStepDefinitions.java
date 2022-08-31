package stepdefinitions.Register;

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
import questions.CompareErrorC;
import questions.CompareHello;
import questions.CompareSuggestion;
import tasks.Register.Register;
import tasks.Register.RegisterBad;
import tasks.Register.RegisterFalse;

import java.util.List;

public class RegisterStepDefinitions {

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

    @When("^he enter his data$")
    public void heEnterHisData(List<Data> dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter(data));
    }
    @When("^he enter his datas$")
    public void heEnterHisDatas(List<Data> dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterFalse.accept(data));
    }


    @Then("^the user will be logged in$")
    public void theUserWillBeLoggedIn() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareHello.compare()
                , Matchers.equalTo("Hola 111111111111 (¿no eres 111111111111? Cerrar sesión)")));
    }


    @When("^he enter invalid password$")
    public void heEnterInvalidPassword(List<Data> dataList) {
        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterBad.enter(data));
    }



    @Then("^print an error$")
    public void printAnError() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareErrorC.compare()
                , Matchers.equalTo("Error: Debes aceptar la política de privacidad")));


}

    @Then("^the user will not be able to register$")
    public void theUserWillNotBeAbleToRegister() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareSuggestion.compare()
                , Matchers.equalTo("Sugerencia: La contraseña debe ser de al menos doce caracteres. Para hacerla más fuerte usa mayúsculas y minúsculas, números y símbolos como ! \" ? $ % ^ y ).")));

    }
    }
