package app;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* app.ShoppingCart.checkout(String))")
    public void beforeLogger(){
        System.out.println("Logging Something before checkout");
    }

    @After("execution(* app.ShoppingCart.checkout(String))")
    public void afterLogger(){
        System.out.println("Logging Something after checkout");
    }

    @Pointcut("execution(* app.ShoppingCart.checkout(String))")
    public void afterReturningPointCut() {}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("Return Value is : " + retVal);
    }
}
