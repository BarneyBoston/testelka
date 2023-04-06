package AccessModifiers1;

import org.testng.annotations.Test;

public class Tests{

    @Test
    public void productPriceTest(){
        ProductPage productPage = new ProductPage();
        productPage.goTo("jakis url");
        String price = productPage.productPrice;
    }
    @Test
    public void addToCartTest(){
        ProductPage productPage = new ProductPage;
        productPage.setAmount(3).addToCart().goToCart();
    }
}
