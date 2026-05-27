public class Temp{
    public static void main(String [] args){
        float degree = Float.parseFloat(args[0]);

        float F = (9/5)*degree + 32;

        System.out.println("Temperature in Fahrenheit: "+F);
    }
}