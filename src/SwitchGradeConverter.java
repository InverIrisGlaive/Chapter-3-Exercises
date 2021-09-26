/* Write a program that receives a categorical grade (A+, A, B, C, ...) and
        prints the numeric grade interval corresponding to that grade. Use a
        switch-case statement.
        "A+"  - >  “Grade is between 100 and 95”
        "A"    - >  “Grade is between 94 and 85”
        "B"    - >  “Grade is between 84 and 75”
        "C"    - >  “Grade is between 74 and 65”
        "D"   - >  “Grade is between 64 and 50
        "F "   - >  “Grade is less than 50”

*/
    import java.util.Scanner;


public class SwitchGradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade; // Convert input to String b/c the user will input a letter grade.

        do {
            System.out.println("Enter a grade:");
            grade = input.next(); // next() versus nextLine(). Next() will split the string into chunks of characters by each white
            //space, stores it, and returns the first word after it's been processed, then the second word, etc. e.g. if you entered A B C,
            // then the program will give you the grade range of A, then grade range of B, then grade range of C. It's going to store your
            //input as three separate inputs.
            // Nextline() reads the whole string (reading from start to the end of the string where \n (the newline character) is, including spaces.
            // Using next() will only return what comes before the delimiter (defaults to whitespace).
            //nextLine() reads input including space between the words (that is, it reads till the end of line \n).
            //Once the input is read, nextLine() positions the cursor in the next line (moves the scanner down one line).
            switch (grade) {
                case "A+":
                    System.out.println("Between 100 and 95");
                    break;  // you need to type break after every case because the cases are "exlcusive", it's one or the other. and you don't want
                //the execution to cascade down/continuously process after
                case "A":
                    System.out.println("Between 85 and 94");
                    break;
                case "B":
                    System.out.println("Between 75 and 84");
                    break;
                case "C":
                    System.out.println("Between 65 and 74");
                    break;
                case "D":
                    System.out.println("Between 50 and 64");
                    break;
                case "F":
                    System.out.println("Between 0 and 49");
                    break;
                default: // this is like the else in if-else statement
                    System.out.println("Invalid grade");
            }
        } while (!grade.equals("")); // Note: since you're taking a string type as grade, you also need to use .equals() to compare string
        // here we use empty string as sentinel value to break the do-while loop.
    }
}
