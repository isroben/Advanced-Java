public class Swap{
    public static void main(String [] args){
        int a = 9, b = 13;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap with third variable: ");
        System.out.println("a: "+a+" b: "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swap without third variable: ");
        System.out.println("a: "+a+" b: "+b);
    }
}