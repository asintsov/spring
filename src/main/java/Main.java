import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Zoo;
import test.event.SomeEvent;

public class Main {
//    public static void main(String[] args) {
//        Zoo zoo = new Zoo(new Dog(), new Cat());
//        zoo.getCat().voice();
//        zoo.getDog().voice();
//    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Zoo zoo = context.getBean("zoo", Zoo.class);
        context.publishEvent(new SomeEvent(zoo, "test"));
        zoo.getCat().voice();
        zoo.getDog().voice();
    }
}
