package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HelloPage;

public class CompareDelete implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HelloPage.COMPARE_DELETE).viewedBy(actor).asString();
    }

    public static CompareDelete compare(){
        return new CompareDelete();
    }
}
