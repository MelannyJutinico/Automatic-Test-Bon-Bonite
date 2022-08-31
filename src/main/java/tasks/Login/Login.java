package tasks.Login;

import interactions.WaitElement;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.LoginPage;

public class Login implements Task {
    Data data;

    public Login(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoginPage.BTN_LOG));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.TXT_DOCUMENT));
        actor.attemptsTo(Enter.theValue(data.getCedula()).into(LoginPage.TXT_DOCUMENT));
        actor.attemptsTo(Enter.theValue(data.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.BTN_lOGIN));
        actor.attemptsTo(Click.on(LoginPage.BTN_lOGIN));


    }
    public static Login enter(Data data) {
        return Tasks.instrumented(Login.class, data);
    }

}
