package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        Doctor doctor1 = applicationContext.getBean(Doctor.class);
        doctor1.setQualification("Random BS");
        System.out.println(doctor.getQualification());
        System.out.println(doctor1.getQualification());
        Staff nurse = applicationContext.getBean(Nurse.class);
        nurse.assist();
    }
}
