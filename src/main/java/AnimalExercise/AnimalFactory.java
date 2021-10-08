package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        Animal animal;
        int age = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        if (type == AnimalType.Cat){
            animal = new Cat("Salmon");
            animal.setAge(age);
        } else if (type == AnimalType.Dog){
            animal = new Dog("Bone");
            animal.setAge(age);
        } else if (type == AnimalType.Duck){
            animal = new Duck("Rice");
            animal.setAge(age);
        } else if (type == AnimalType.Cow){
            animal = new Cow("Grass");
            animal.setAge(age);
        } else { animal = null; }

        return animal;
    }
}
