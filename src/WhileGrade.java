/* Write a Java program that will continuously prompt the user for an
        integer grade and prints the corresponding output to the console (from
        previous exercise)
        • The program should end once the user inputs the value -1.

        • If a value that is not an integer in the [0, 100] interval is input, then
        the program should print an error message and ask for the next input.

*/

import java.util.Scanner;

public class WhileGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Enter a grade: "); // ask for the grade here so that the while loop actually has something to operate on.
        int grade = input.nextInt();

        while (grade != -1) {
            if (95 <= grade && grade <= 100)
                System.out.println("A+");     //note here: if the code is only one line, you don't need to put it inside a block/curly brackets.
            else if(85 <=grade && grade <=94)
                System.out.println("A");
            else if(75 <=grade && grade <=84)
                System.out.println("B");
            else if(65 <=grade && grade <=74)
                System.out.println("C");
            else if(50 <=grade && grade <=64)
                System.out.println("D");
            else if(0<=grade && grade <= 49)
                System.out.println("F");
            else
                System.out.println("Error: invalid number");

            System.out.println("Enter a grade: "); // You need to ask for the grade again. This is the "updater" line that updates the value.
            // If you don't have this line they will just keep using the original grade value of the first input and not update.
            // because the top while loop condition line (if you remove this bottom updater line at the bottom) is outside of the loop.
            // e.g. if your input is 95 for a grade, it will just keep printing "A+"
            grade = input.nextInt();
        }
    }
}
