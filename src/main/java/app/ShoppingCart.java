package app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class ShoppingCart {
    public String checkout(String status){
//        Loggin
//        Authentication/Authorization
//        Processing
        System.out.println("Checking out");
        return status;
    }
}
