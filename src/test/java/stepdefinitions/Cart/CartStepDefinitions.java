package stepdefinitions.Cart;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.CompareDelete;
import questions.CompareDocument;
import tasks.Cart.Cart;
import tasks.Cart.CartDelete;
import tasks.Login.Login;

public class CartStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Tatiana");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^the user add a product to the cart$")
    public void theUserAddAProductToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cart.add());
    }

    @When("^remove the product from the cart$")
    public void removeTheProductFromTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartDelete.detele());
    }

    @Then("^print a notification of his deletion$")
    public void printANotificationOfHisDeletion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareDelete.compare()
                , Matchers.equalTo("“Producto” eliminado.")));
    }
}
