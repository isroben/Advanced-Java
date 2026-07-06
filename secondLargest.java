import java.util.Scanner;

public class secondLargest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b and c: ");
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if(a > b && a < c || a > c && a < b){
            System.out.println("A is the second greatest Number.");
        }
        else if(b>c && b<a || b>a && b<c){
            System.out.println("B is the Second grestest.");
            }
        else{
            System.out.println("C is second greatest number.");
        }
    }
}