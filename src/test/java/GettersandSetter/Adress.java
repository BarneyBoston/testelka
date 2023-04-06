package GettersandSetter;

public class Adress {

    private String street;
    private String apartment;
    private String city;
    private String postalcode;

    public Adress (String city, String street, String apartment){
        this.street = street;
        this.apartment = apartment;
        this.city = city;
    }
    public Adress (String city, String street, String apartment, String postalcode){
        this(apartment,city,street);
        this.postalcode = postalcode;
    }

    public String getStreet(){
        return street;
    }

    public String getApartment(){
        return apartment;
    }

    public String getCity(){
        return city;
    }

    public void setCity (String cityName){
        city = cityName;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}
