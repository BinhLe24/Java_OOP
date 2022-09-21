import java.util.*;

public class lab_05 {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("=====MENU=====");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Search number");

            System.out.print("Please enter your option: ");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();

            if (userOption == 1) {
                System.out.print("--> OPTION 1 - Please enter your number: ");
                Scanner scanner1 = new Scanner(System.in);
                int insertedValue = scanner1.nextInt();
                myArrList.add(insertedValue);
            } else if (userOption == 2) {
                System.out.println("--> OPTION 2 - Your number is: " + myArrList);
            } else if (userOption == 3) {
                int myMax = myArrList.get(0);
                for (int i : myArrList) {
                    if (myMax < i) {
                        myMax = i;
                    }
                }
                System.out.println("--> OPTION 3 - Maximum number is: " + myMax);
            } else if (userOption == 4) {
                int myMin = myArrList.get(0);
                for (int i : myArrList) {
                    if (myMin > i) {
                        myMin = i;
                    }
                }
                System.out.println("--> OPTION 4 - Minimum number is: " + myMin);
            } else if (userOption == 5) {
                System.out.print("--> OPTION 5 - Please enter number which you want to search: ");
                Scanner scanner2 = new Scanner(System.in);
                int mySearch = scanner2.nextInt();
                List<Integer> myPosition = new ArrayList<>();

                for (int i = 0; i < myArrList.size(); i++) {
                    if (mySearch == myArrList.get(i)) {
                        myPosition.add(i);
                    }
                }
                System.out.println("Index of your number is: " + myPosition);
            }
        }
    }
}
