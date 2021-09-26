/*
        Write a Java program that asks the user for an integer grade (between 0 and 100) and prints to the console:
        • "A+" if grade is between 100 and 95
        • "A" if grade is between 94 and 85
        • "B" if grade is between 84 and 75
        • "C" if grade is between 74 and 65
        • "D" if grade is between 64 and 50
        • "F" otherwise
*/

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Enter a grade: ");
        int grade = input.nextInt();

        if (95 <= grade && grade <= 100)
            System.out.println(("A+"));     //note here: if the code is only one line, you don't need to put it inside a block/curly brackets.
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
    }
}
