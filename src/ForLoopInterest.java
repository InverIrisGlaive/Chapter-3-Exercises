public class ForLoopInterest {
    public static void main(String[] args) {
        double rate = 0.10;
        double principal = 100;
        for ( int years = 0; years < 5; years++) {
            double interest = principal * rate;
            principal += interest;
            System.out.println(principal);
        }
    }
}