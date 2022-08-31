package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HelloPage {
    public static final Target COMPARE_HELLO = Target.the("Compare the hello")
            .locatedBy("//p[contains(text(),'Hola')]");
    public static final Target COMPARE_ERROR = Target.the("Compare the error")
            .locatedBy("//ul/li[contains(text(),' Debes aceptar la política de privacidad')]");
    public static final Target COMPARE_SUGGESTION = Target.the("Compare the suggestion ")
            .locatedBy("//small[contains(text(),\"Sugerencia\")]");
    public static final Target COMPARE_PASSWORD = Target.the("compare the password")
            .locatedBy("//ul/li[contains(text(),': la contraseña que has introducido para el nombre de usuario ')]");
    public static final Target COMPARE_DOCUMENT = Target.the("compare the document")
            .locatedBy("//ul/li[contains(text(),': El nombre de usuario')]");
    public static final Target COMPARE_DELETE = Target.the("compare the delete of a product")
            .locatedBy("//*[contains(text(),'eliminado')]");

}
