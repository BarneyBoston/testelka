package AccessModifiers1;

public class ProductPage extends BasePage {

    String productName;
    String productPrice;

    protected ProductPage addToCart(){
        System.out.println("Product has been added to cart");
        return this;
    }
    protected ProductPage setAmount(int amount){
        System.out.println("Chosen amount: " + amount);
        return this;
    }
    protected void goToCart(){
        System.out.println("Go to cart");
        // return new CartPage(); - gdybysmy mieli już taką klase
    }
}
