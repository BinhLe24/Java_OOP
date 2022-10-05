package lab_08_02;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public void animalRacing (List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed())
            {
                winner = animal;
            }
        }
        System.out.println("Winner is " + winner);
        System.out.println("The winner speed was " + winner.getSpeed());
    }

    public static void main(String[] args) {
        {
            Animal dog = new Dog("Lu");
            Animal horse = new Horse("Mi");
            Animal tiger = new Tiger("Gao");

            List<Animal> myList = Arrays.asList(dog, horse, tiger);
            AnimalController animalController = new AnimalController();
            animalController.animalRacing(myList);
        }
    }
}
