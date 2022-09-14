package lab_03;

public class lab03_04 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 1, 2, 8, 9, 33, 44};
        int[] array2 = new int[]{2, 10, 13, 30};
        int[] myArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            myArray[i] = array1[i];
        }
        for (int i = array1.length; i < myArray.length; i++) {
            myArray[i] = array2[i- array1.length];
        }

        for (int i = 0; i < myArray.length ; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[j]<myArray[i]){
                    int myTemporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = myTemporary;
                }
            }
        }
        System.out.print("This is new array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }
    }
}
