package lab_09;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab_09.Animal.Builder;

public class AnimalRacing {
    public List<Animal> getAnimalRacer(List<Animal> animalList) {
        List<Animal> animalRacerList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal.isWings() == false) {
                animalRacerList.add(animal);
            }
        }
        racerInvalidator(animalRacerList.size());
        return animalRacerList;
    }
    private void racerInvalidator (int number){
        if (number == 0){
            System.out.println("There is no animal without wings");
        }
    }
    public Animal getWinner(List<Animal> animalList) {
        List<Animal> racingAnimals = getAnimalRacer(animalList);
        if (racingAnimals.isEmpty()){
            return null;
        }
        Animal winner = racingAnimals.get(0);
        for (Animal animal : racingAnimals) {
            if (winner.getSpeed() < animal.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().setName("Anna").setSpeed(new SecureRandom().nextInt(100)).setWings(false).builder();
        Animal snake = new Animal.Builder().setName("Mimi").setSpeed(new SecureRandom().nextInt(40)).setWings(false).builder();
        Animal falcon = new Animal.Builder().setName("Haha").setSpeed(new SecureRandom().nextInt(110)).setWings(true).builder();

        AnimalRacing animalRacing = new AnimalRacing();
        List<Animal> myList = Arrays.asList(tiger, snake, falcon);
        Animal myWinner = animalRacing.getWinner(myList);
        if (myWinner != null) {
            System.out.println("Winner is " + myWinner.getName() + " with speed " + myWinner.getSpeed());
        }
    }
}
