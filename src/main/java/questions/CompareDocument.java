package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HelloPage;

public class CompareDocument implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HelloPage.COMPARE_DOCUMENT).viewedBy(actor).asString();
    }

    public static CompareDocument compare(){
        return new CompareDocument();
    }
}
