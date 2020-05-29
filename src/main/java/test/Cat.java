package test;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    public void voice() {
        System.out.println("mi");
    }
}
