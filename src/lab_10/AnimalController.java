package lab_10;

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
        System.out.println("The winner is " + winner.getName() + " with speed " + winner.getSpeed());
    }

    public static void main(String[] args) {

            Animal dog = new Dog();
            Animal horse = new Horse();
            Animal tiger = new Tiger();

            List<Animal> myList = Arrays.asList(dog, horse, tiger);
            AnimalController animalController = new AnimalController();
            animalController.animalRacing(myList);

    }
}
