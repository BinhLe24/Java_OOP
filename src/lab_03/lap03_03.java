package lab_03;

public class lap03_03 {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{2, 10, 1, 9, 1, 12};

        for (int i = 0; i < myIntArray.length; i++) {
            for (int j = i+1; j < myIntArray.length; j++){
                if (myIntArray[j] < myIntArray[i]) {
                    int myTemporary = myIntArray[j];
                    myIntArray[j] = myIntArray[i];
                    myIntArray[i] = myTemporary;
                }
            }
        }
        System.out.print("This is new array:");
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(" " + myIntArray[i]);
        }
    }
}
