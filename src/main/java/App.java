import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // по аналогии с примером все делаем
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("Cat");

        System.out.println(bean.getMessage());
        System.out.println(beanCat.getMessage());
    }
}