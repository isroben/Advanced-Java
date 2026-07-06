import java.util.Scanner;
public class TernaryOptr{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        int largest = (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        int smallest = (a<=b)?((a<=c)?a:c): ((b<=c)?b:c);
        
        System.out.println("Larget num: "+largest);
        System.out.println("Smalleset num: "+smallest);
    }
}