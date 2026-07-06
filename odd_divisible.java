import java.util.Scanner;

public class odd_divisible{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 1){
            if(num%3 == 0){
                System.out.println("The number is odd and divisible by 3.");
            }
            else{
                System.out.println("The number is odd but not divisible by 3");
            }
        }
        else if(num%2==0){
            if(num%3 == 0){
                System.out.println("The number is odd and divisible by 3.");
            }
            else{
                System.out.println("The number is odd but not divisible by 3");
            }
        }
        else{
            System.out.println("Invalid!");
        }
    }
}