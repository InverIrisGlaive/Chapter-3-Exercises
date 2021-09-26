/* Write a Java program that will continuously prompt the user for an integer grade and prints the corresponding output to the console (from
previous exercise)
• The program should end once the user inputs the value -1.
. Do this with a do-while loop.
• If a value that is not an integer in the [0, 100] interval is input, then the program should print an error message and ask for the next input.

*/


import java.util.Scanner;

public class DoWhileGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int grade; // remove the asking for grade part and replace it with just type declaration of "grade".

        do {
            System.out.println("Enter a grade: ");// put the asking for grade part under "do" block
            // b/c you need it to execute here as every while loop starts. AKA ask for a new grade everytime.
            //do-while loops "asks" for input first, evaluates, then check condition later. This property will be useful
            //to have the first iteration of the loop outside the loop (for now you can only see that it moved the input line into the loop
            // but later on you'll move other data and calculations inside the loop as well.
            grade = input.nextInt();
            if (95 <= grade && grade <= 100)
                System.out.println("A+");     //note here: if the code is only one line, you don't need to put it inside a block/curly brackets.
            else if (85 <= grade && grade <= 94)
                System.out.println("A");
            else if (75 <= grade && grade <= 84)
                System.out.println("B");
            else if (65 <= grade && grade <= 74)
                System.out.println("C");
            else if (50 <= grade && grade <= 64)
                System.out.println("D");
            else if (0 <= grade && grade <= 49)
                System.out.println("F");
            else
                System.out.println("Error: invalid number");
        } while (grade !=-1); // the while loop is at the end, the condition checking is at the end instead of beginning. note you DO need
        //the semicolon after the while statement in a do-while loop to close it b/c it is not covered by the curly bracket/block of the "do" part.

        }
    }

