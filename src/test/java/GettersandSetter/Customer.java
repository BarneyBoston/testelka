package GettersandSetter;

public class Customer {

    private String name;
    private String lastName;
    private int age;
    private Adress adress;

    public Adress getAdress(){
        return adress;
    }

    public void setAdress (Adress adressParameter){
        adress = adressParameter;
    }

    public void setAge (int ageParameter) {
        if (ageParameter<0){
            throw new IllegalArgumentException();
        }
        age=ageParameter;
    }
    public String getAge(){
        return age + " years";
    }
}
