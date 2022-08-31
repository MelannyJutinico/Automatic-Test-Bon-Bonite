package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target A_PRODUCTS = Target.the("Click in the menu-accesorios")
            .locatedBy("//li[@id=\"menu-item-7\"]");
    public static final Target BTN_PURCHASE = Target.the("Click on the button comprar")
            .locatedBy("//a[@data-product_id=\"203189\"]");
    public static final Target BTN_CART = Target.the("Click in the cart")
            .locatedBy("//p/a[@href=\"https://www.bon-bonite.com/carrito/\"]");
    public static final Target BTN_DELETE = Target.the("Click in delete a product")
            .locatedBy("//a[@class=\"remove\"]");
}
