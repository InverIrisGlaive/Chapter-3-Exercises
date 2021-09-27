public class CS2910 {
    public static int CalculateFinalGrade( int[] grades) throws Exception{ //type "throws" to  the method that a exception might occur here)
        double finalGrade = 0; // we use double data type here for finalGrade to avoid rounding error, then turning the finalGrade into int last.
        if (grades.length != 9)
            throw new Exception("Ninegrades must be provided"); // type "new" to create an exception object, as exception itself is an object.
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 0 || grades[i] > 100) { // 2nd exception: if grade is lower than 0 or higher than 100.
                throw new Exception("Grades must be between 0 and 100"); // this is the act of actually "throwing" an exception. without "throws" atop
            }

        //in the method definition you cannot type throw here. it will cause a runtime error
            switch (i) {
                case 0 -> finalGrade += grades[i] * 0.1;
                case 1, 2, 3, 4, 5 -> // you can declare and type more than 1 case in switch-statements.
                        finalGrade += grades[i] * 0.05;
                case 6, 7 -> finalGrade += grades[i] * 0.2;
                case 8 -> finalGrade += grades[i] * 0.25;

            /* the above is the enhanced switch statement which does the same thing
            switch (i) {
                   case 0:
                       finalGrade += grades[i] *0.1;
                       break;
                   case 1: case 2: case 3: case 4: case 5: // you can declare and type more than 1 case in switch-statements.
                       finalGrade += grades[i]*0.05;
                       break;
                   case 6: case 7:
                       finalGrade += grades[i]*0.2;
                       break;
                   case 8:
                       finalGrade += grades[i]*0.25;
                       break;
            */
            }

        }
        return (int) Math.round(finalGrade); // write the return statement after the for loop ends. You don't need to import math in java.
    }
}
