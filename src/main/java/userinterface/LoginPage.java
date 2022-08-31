package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target BTN_LOG = Target.the("Click in button account in the index")
            .locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/']");
    public static final Target TXT_REGDOCUMENT = Target.the("Enter your document number for register")
            .locatedBy("//input[@id=\"reg_username\"]");
    public static final Target TXT_REGEMAIL = Target.the("Enter your email")
            .locatedBy("//input[@id=\"reg_email\"]");
    public static final Target TXT_REGPASSWORD = Target.the("Enter your password for register")
            .locatedBy("//input[@id=\"reg_password\"]");
    public static final Target CHECKBOX_TERMS = Target.the("Click in the terms")
            .locatedBy("//input[@id=\"privacy_policy_reg\"]");
    public static final Target BTN_REGISTER = Target.the("Click in register")
            .locatedBy("//button[@name=\"register\"]");
    public static final  Target TXT_DOCUMENT = Target.the("Enter your document for login")
            .locatedBy("//input[@id=\"username\"]");
    public static final  Target TXT_PASSWORD = Target.the("Enter your password for login")
            .locatedBy("//input[@id=\"password\"]");
    public static final  Target BTN_lOGIN = Target.the("Click in login")
            .locatedBy("//button[@value=\"Acceder\"]");
}
