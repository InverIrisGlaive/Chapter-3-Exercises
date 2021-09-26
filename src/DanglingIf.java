public class DanglingIf {
    public static void main(String[] args) {
        float x = 1;
        float y = -1;
        if ( x > 0 )
            if (y > 0)
                System.out.println("First case");
            else
                System.out.println("Second case");
    }

}
