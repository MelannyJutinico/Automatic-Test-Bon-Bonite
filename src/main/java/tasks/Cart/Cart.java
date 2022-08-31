package tasks.Cart;

import interactions.WaitElement;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hover;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import tasks.Login.Login;
import userinterface.CartPage;
import userinterface.LoginPage;

public class Cart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CartPage.A_PRODUCTS));
        actor.attemptsTo(Click.on(CartPage.BTN_PURCHASE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static Cart add() {
        return Tasks.instrumented(Cart.class);
    }
}
