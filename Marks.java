import java.util.Scanner;

public class Marks{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int total = 0;
        
        System.out.println("Enter the marks of Sub1, Sub2, .., Sub5: ");

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        total  = s1+s2+s3+s4+s5;

        double avg = (double)total/5;

        System.out.println("Total marks: "+total);
        System.out.println("Averatge marks: "+avg);
    }
}