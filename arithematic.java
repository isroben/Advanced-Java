public class arithematic{
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a+b;
        int diff = a - b;
        int prod = a*b;
        int div = a/b;

        System.out.println("The sum of a and b = "+sum+"\nDifference = "+diff+"\n Product = "+prod+"\nDifference = "+div);
    }
}