package lab_06;

import java.util.List;

public class lab06_03 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] charArr = myStr.toCharArray();
        for(char character : charArr){
            if(Character.isDigit(character)){
                System.out.print(character);
            }
        }

        /* String myNumberStr = "";
        for (char character : charArr) {
            if (Character.isDigit(character)) {
                myNumberStr = myNumberStr + Character.toString(character);
            }
        }
        int myNumber = Integer.parseInt(myNumberStr);
        int Total = myNumber * 10;
        System.out.print(Total);
         */
    }
}
