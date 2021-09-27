/*
Write a static method CalculateFinalGrade(int[] grades).

1.The method must calculate the final grade.  Here the order and worth of the grades:

grades[0] : Readings (worth 10%)
grades[1] : Labs(5%)
grades[2-5]: Assignments (5%)
grades[6] : Midterm 1 (20%)
grades[7] : Midterm 2 (20%)
grades[8] : Final Exam (25%)
NOTE: this is not the grading policy in CS-2910

2. The method must throw the following Exceptions:
   - "Nine grades must be provided.” (if the number of provided grades is not correct)
   - "Grades must be between 0 and 100.” (if grades are not in the proper range)

For example:
int[] grades = {67, 98, 78, 65, 45, 49, 56, 72, -1};
int finalGrade;
try {
   finalGrade = CS2910.CalculateFinalGrade(grades);
   System.out.printf("The final grade is " + finalGrade);
}catch (Exception e){
   System.out.println(e.toString());

   result: java.lang.Exception: Grades must be between 0 and 100.
 */

public class GradeCalculationDriver {
    public static void main(String[] args) { //You can also just type "throws" here and pass the exception up, and not type a try...catch statement
        //but this means this method won't deal with the exception thrown in the CS2910 method. if you want to solve the exception thrown in the
        //cs2910 method, you don't type "throws", and you type a try catch statement here
        int[] grades = {67, 98, 78, 65, 45, 49, 56, 72, -1};
        try {// this try...catch statement will solve the exception raised in the CS1920 class (e.g. neg grade, or less than 9 grades)
            System.out.println("The final grade is " + GradeCalculations.CalculateFinalGrade(grades));
        } catch (Exception e) {
            System.out.println(e); // you can call a method in the same package if the method is a static method without actually having to instantiate
            //an object here. So just call it. Here the variable e represents the types of exception object thrown in the method CS2910.
        }// it's supposed to throw an exception error b/c one of the grade is a negative number
        // result: "java.lang.Exception: Grades must be between 0 and 100"
    }
}
