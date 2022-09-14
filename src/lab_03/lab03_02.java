package lab_03;

public class lab03_02 {
    public static void main(String[] args) {
        int[] myIntArray = new int[]{10, 2, 7, 30, 129, 4, 20, 101};

        int myMin = myIntArray[0];
        int myMax = myIntArray[0];
        for (int i : myIntArray) {
            if (myMax < i) {
                myMax = i;
            } else if (myMin > i) {
                myMin = i;
            }
        }
        System.out.println("Max is " + myMax);
        System.out.println("Min is " + myMin);
    }
}
