//Write a program that declares and initializes two arrays of strings:
//1. containing the ranks of the cards ("2", "3",... "Jack", "Queen" ...)
//2. containing the suits of the cards ("Clubs", "Diamonds", ...)
// Then initialize and fill an array with the names of all the cards using the
//previous arrays.
//
//Finally, print all the card’s names.


import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] deck = new String[52];
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "ace"};
        String[] suit = {"Clubs", "Hearts", "Diamonds", "Spades"}; // you can declare the length of the array if you directly assign an array value to it

       for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                String s = ranks[i] + suit[j]; //this concatenate the first item in the i-array, "2", to the first item in the second array, "Clubs"
                deck[(i * suit.length) + j] = s; // You've already concatentated the string, but you need to figure out where to put it in the deck array
                // first iteration: i=0, suit.length = 4, and j = 0, 1, 2, 3, so (0*4=0)+0, means
                //index 0, so put the first concatenated value of 2Clubs at deck[0], 2Hearts at deck [1], 2Diamonds at deck[2].etc
            }

        }System.out.println(Arrays.toString(deck));// Array.toString(deck) means deck Stringified (make a String representation of the array that can be printed.
    }
}
