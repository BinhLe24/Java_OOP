package lab_08_02;

import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public void racingAnimal(List<Animal> animalList) {
        int speedMax = 0;
        String animalName = "";
        for (Animal animal : animalList) {
            int animalSpeed = animal.getSpeed();
            if (speedMax < animalSpeed) {
                speedMax = animalSpeed;
                animalName = animal.getName();
            }
            System.out.println(animal.getName() + " with speed: " + animalSpeed);
        }
        System.out.println("Winner is " + animalName + " with speed: " + speedMax);
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        AnimalController animalController = new AnimalController();
        animalController.racingAnimal(animalList);
    }
}
