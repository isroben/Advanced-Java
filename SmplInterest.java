public class SmplInterest{
    public static void main(String [] args){
        float principle = Float.parseFloat(args[0]);
        float rate = Float.parseFloat(args[1]);
        float time = Float.parseFloat(args[2]);

        double simpleInterest = (principle*time*rate)/100;

        System.out.println("The simple interest is: "+simpleInterest);
    }
}