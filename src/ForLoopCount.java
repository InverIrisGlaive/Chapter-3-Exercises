public class ForLoopCount {
    public static void main(String[] args) {
        for (int i=10; i>=1; i--){
            System.out.println(i);
        } // in a block, you don't need the semi-colon after the curly/accolade bracket. But you DO need a semi-colon in every statement inside the block
        //You CAN add a semicolon after an accolade, but it won't break the program.
        for (int j = 1; j <= 10;j++){
            System.out.println(j);
        }
    }
}
// so ";" indicates the end/termination of a statement.
//loops usually don't need semi colons after that line condition b/c it's wrapped in a block (curly brackets/accolades) and that tells the program
//to execute the program (without needing to put the semi-colons there). All this is True for all loops and if statments, EXCEPT for do-while loops
//which you need to put a semi-colon after while condition b/c the while loop is outside of the "block" and you need it to terminate the while statment.
// in the case of the empty statement