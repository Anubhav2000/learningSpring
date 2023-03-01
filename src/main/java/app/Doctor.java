package app;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist(){
        System.out.println("Doctor is Assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construction method is called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name is called");
    }
}
