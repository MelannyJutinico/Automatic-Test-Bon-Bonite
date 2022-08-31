package tasks.Register;

import interactions.WaitElement;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.LoginPage;

public class Register implements Task {
    Data data;

    public Register(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoginPage.BTN_LOG));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.TXT_REGEMAIL));
        actor.attemptsTo(Enter.theValue(data.getCedula()).into(LoginPage.TXT_REGDOCUMENT));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(data.getEmail()).into(LoginPage.TXT_REGEMAIL));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(data.getPassword()).into(LoginPage.TXT_REGPASSWORD));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(LoginPage.TXT_REGPASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.CHECKBOX_TERMS));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LoginPage.CHECKBOX_TERMS));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LoginPage.BTN_REGISTER));try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static Register enter(Data data) {
        return Tasks.instrumented(Register.class, data);
    }


}
