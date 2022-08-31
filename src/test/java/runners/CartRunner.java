package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/cart.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "stepdefinitions/Cart")
public class CartRunner {
}
