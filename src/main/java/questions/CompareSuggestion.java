package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HelloPage;

public class CompareSuggestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HelloPage.COMPARE_SUGGESTION).viewedBy(actor).asString();
    }

    public static CompareSuggestion compare(){
        return new CompareSuggestion();
    }
}
