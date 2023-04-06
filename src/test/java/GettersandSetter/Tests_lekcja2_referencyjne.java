package GettersandSetter;

import org.testng.annotations.Test;

public class Tests_lekcja2_referencyjne {

    @Test
    public void gettersAndSettersTest(){
        Customer customer = new Customer();
        int age = 15;
        customer.setAge(age);
        System.out.println("Age: " + customer.getAge());
    }

    @Test
    public void gettersAndSettersObjects(){
        Customer customer = new Customer();
        Adress adress = new Adress("Wypizdów","Kurewski","420");
        customer.setAdress(adress);
        adress.setStreet("Duży");
        System.out.println("Adress: " + customer.getAdress().getCity()+ " "+
                customer.getAdress().getStreet() + " " +
                customer.getAdress().getApartment());
        adress.setCity("Pizdzichów");
        System.out.println("Adress: " + customer.getAdress().getCity()+ " "+
                customer.getAdress().getStreet() + " " +
                customer.getAdress().getApartment());
    }

}
