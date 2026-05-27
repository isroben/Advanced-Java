// import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        float len = Float.parseFloat(args[0]);
        float bth = Float.parseFloat(args[1]);

        float area = len * bth;
        float periMtr = 2*(len+bth);


        System.err.println("Area of Reactangle is: "+area);
        System.err.println("Perimeter of Reactangle is: "+periMtr);
    }
    
}
