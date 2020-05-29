package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private Animal dog;
    private Animal cat;

    @Autowired
    public Zoo(Animal dog, Animal cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Animal getDog() {
        return dog;
    }

    public Animal getCat() {
        return cat;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public void setCat(Animal cat) {
        this.cat = cat;
    }
}
