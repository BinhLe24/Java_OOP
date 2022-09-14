package lab_03;

public class lab03_01 {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{1, 3, 4, 5, 6, 22, 30, 45, 101};
        int myEven = 0;
        int myOdd = 0;
        for (int value : myIntArray){
            if ((value%2)==0){
                myEven = myEven + 1;
            }else {
                myOdd = myOdd + 1;
            }
        }
        System.out.println("There are " + myEven + " evens");
        System.out.println("There are " + myOdd + " odds");
    }
}
