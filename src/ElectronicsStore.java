import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           String[] electronicsProduct = {"computer", "screen", "mouse", "printer", "keyboard"};
        System.out.println("The products you selected are: " + Arrays.toString(electronicsProduct));
        System.out.println();


        System.out.println("the price of all your products is: " + calculateTotal(electronicsProduct) + "$");
        System.out.println();

        System.out.println("How do you pay? - cash , check or credit card !!!");
        String  userInput = scanner.nextLine();
        printInformation(  userInput , calculateTotal(electronicsProduct) , false);

    }

    public static int calculateTotal(String[] selectedItems) {
        // מחירים
        int computer = 2500;
        int screen = 1200;
        int mouse = 250;
        int printer = 500;
        int keyboard = 350;

        // משתנה לסכום הכולל
        int total = 0;

        // לולאה לעבור על כל הפריטים שנבחרו
        for (String item : selectedItems) {
            if (item.equals("computer")) {
                total += computer;
            } else if (item.equals("screen")) {
                total += screen;
            } else if (item.equals("mouse")) {
                total += mouse;
            } else if (item.equals("printer")) {
                total += printer;
            } else if (item.equals("keyboard")) {
                total += keyboard;
            }
        }
        return total;
    }

    public static void printInformation(String PaymentType, int sum , boolean isTrue) {
        if (PaymentType.equals("cash")){
            System.out.printf("Please give the amount %d in cash to the cashier." ,sum);
        } else if (PaymentType.equals("check")) {
            System.out.printf("Please write the amount %d on the check." ,sum);
        }else if (PaymentType.equals("credit card")) {
            if (isTrue){
                System.out.printf("The credit card was charged for %d amount." , sum);
            }else {
                System.out.println("The credit card is invalid, try another payment option.");
            }

        }
    }

}
