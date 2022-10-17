package lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void racerInvalidation(int number){
        if (number == 0){
            System.out.println("There is no animal without wings");
        }
    }
    public List<FlyMoveAble> getAnimalRacer(List<FlyMoveAble> animalRacerList) {
        List<FlyMoveAble> animalRacerList1 = new ArrayList<>();
        for (FlyMoveAble animalRacer : animalRacerList) {
            if (animalRacer.flyAble() == false) {
                animalRacerList1.add(animalRacer);
            }
        }
        racerInvalidation(animalRacerList1.size());
        return animalRacerList1;
    }
    public FlyMoveAble getWinner(List<FlyMoveAble> moveAbleObject){
        List<FlyMoveAble> moveAbleList = getAnimalRacer(moveAbleObject);
        if (moveAbleList.isEmpty()){
            return null;
        } else if (moveAbleList.size() == 1) {
            return moveAbleList.get(0);
        }
        FlyMoveAble winner = moveAbleObject.get(0);
        for (FlyMoveAble moveAble : moveAbleObject) {
          if (winner.speed() < moveAble.speed()){
              winner = moveAble;
          }
        }
        return winner;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        Falcon falcon = new Falcon();

        RacingController racingController = new RacingController();
        List<FlyMoveAble> animalList = racingController.getAnimalRacer(Arrays.asList(dog, horse, falcon));
        MoveAble winnerAnimal =  racingController.getWinner(animalList);
        if (animalList != null) {
            System.out.println("The winner with speed " + winnerAnimal.speed());
        }
    }
}
