package AccessModifiers2;

import AccessModifiers1.BasePage;

public class ProductPage {

    String productName;
    String productPrice;

    protected void addToCart(){
        BasePage basePage = new BasePage();
        basePage.searchForProduct("product");
        System.out.println("Product added to cart");
    }
}
