//import textio.TextIO;
import java.util.Scanner;
/**
 * This program reads a line of text entered by the user.
 * It prints a list of the letters that occur in the text,
 * and it reports how many different letters were found.
 */
public class ListLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Enter a string: ");
        str = scanner.nextLine();
        str = str.toUpperCase();
        int count = 0;


        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (str.indexOf(letter) >= 0) {
                System.out.println(letter);
                count++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(count);
    }
}
//        Scanner input = new Scanner(System.in);
//        String str;  // Line of text entered by the user.
//        int count;   // Number of different letters found in str.
//        char letter; // A letter of the alphabet.
//
//        System.out.println("Please type in a line of text.");
//        str = input.nextLine();

//        str = str.toUpperCase();
//
//        count = 0;
//        System.out.println("Your input contains the following letters:");
//        System.out.println(); //New Line
//        System.out.print("   ");
//
//        for ( letter = 'A'; letter <= 'Z'; letter++ ) { // apparently you can do it with if (str.indexOf(letter) >= 0); but ignore the nested loop?
//            if (str.indexOf(letter) >= 0) {
//                System.out.println(letter);
//                count++;
//            }
//        }
////            int i;  // Position of a character in str. //
////            for ( i = 0; i < str.length(); i++ ) {
////                if ( letter == str.charAt(i) ) {
////                    System.out.print(letter);
////                    System.out.print(' ');
////                    count++;
////                    break;
////                }
////            }
////        }
////
//        System.out.println();
//        System.out.println();
//        System.out.println("There were " + count + " different letters.");
//
//    } // end main()
//
//} // end class ListLetters
