package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HelloPage;

public class CompareErrorC implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HelloPage.COMPARE_ERROR).viewedBy(actor).asString();
    }

    public static CompareErrorC compare(){
        return new CompareErrorC();
    }
}
