public class Exp{
    public static void main(String [] args){
        int a = 9, b = 13, c= 3;

        double x = a-b/3.0 + c*2-1;
        double y = a- (float)b/(3+c)*(2-1);
        double z = a - ((float)b/(3+c)*2)-1;

        System.out.println("X: "+x);
        System.out.println("Y: "+z);
        System.out.println("Z: "+z);
    }
}