import java.util.Scanner;

public class arithematicSW{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        char s = sc.next().charAt(0);
        switch(s){
            case '+':
                System.out.println("The Addition of a and b is: "+(a+b));
                break;
            
            case '-':
                System.out.println("The Subtraction of a and b is: "+(a-b));
                break;

            case '*':
                System.out.println("The Product of a and b is: "+(a*b));
                break;
            
            case '/':
                System.out.println("The Division of a and b is: "+(a/b));
                break;
            
            default:
                break;
        }
    }
}