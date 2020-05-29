package test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.Cat;
import test.Dog;

@Configuration
public class AppConfiguration {

    @Bean(name = "dog")
    public Dog createDog() {
        return new Dog();
    }

    @Bean(name = "cat")
    public Cat createCat() {
        return new Cat();
    }
}
