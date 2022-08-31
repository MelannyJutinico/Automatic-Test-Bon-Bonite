package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HelloPage;

public class ComparePassword implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HelloPage.COMPARE_PASSWORD).viewedBy(actor).asString();
    }

    public static ComparePassword compare(){
        return new ComparePassword();
    }
}
