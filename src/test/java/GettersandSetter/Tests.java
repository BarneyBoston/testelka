package GettersandSetter;

import org.testng.annotations.Test;

public class Tests{

    @Test
    public void GettersandSetterTests(){
        Customer customer = new Customer();
        customer.setAge(15);
        System.out.println(customer.getAge());
    }
}
