package test;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public void voice() {
        System.out.println("gav");
    }
}
