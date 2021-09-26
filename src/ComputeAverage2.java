import textio.TextIO;
import java.util.Scanner;

public class ComputeAverage2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;     // The user's input.
        double number;  // The input converted into a number.
        double total;   // The total of all numbers entered.
        double avg;     // The average of the numbers.
        int count;      // The number of numbers entered.
        total = 0;
        count = 0;
        System.out.println("Enter your numbers, press return to end.");
        while (true) {
            System.out.print("? ");
            str = TextIO.getln(); // Scanner.
//            str = input.nextLine();
            if (str.equals("")) {
                break; // Exit the loop, since the input line was blank.
            }
//            try {
//                number = Double.parseDouble(str);
//                // If an error occurs, the next 2 lines are skipped!
//                total = total + number;
//                count = count + 1;
//            }
//            catch (NumberFormatException e) {
//                System.out.println("Not a legal number!  Try again.");
//            }
            number = Double.parseDouble(str);
            // If an error occurs, the next 2 lines are skipped!
            total = total + number;
            count = count + 1;
//             the whole point of the try...catch statement is to "catch" the error AKA exceptions, and dealing with it
//            WITHOUT crashing and thus stopppnig a program. You CAN technically catch an exception and tell the program to do nothing with it
//            inside the catch statement, but that would made your program generate illogical outputs as a result.
//            Try...catch is useful when you want to catch errors (either from user or from program itself) but want the program to keep running.
        }
        avg = total/count;
        System.out.printf("The average of %d numbers is %1.6g%n", count, avg);
    }

}