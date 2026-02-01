public class MathApp {

    public static double calculateHypotenuse(int a, int b) {

        double aa = Math.pow(a , 2);
        double bb = Math.pow(b , 2);
        return Math.sqrt(aa + bb);

    }

    public static void main(String[] args){

        System.out.println("The Hypotenuse of 20 and 10 is " + calculateHypotenuse(20 , 10));

        int x = Math.abs(-100);
        System.out.println(x);

        int y  = Math.min(110 , 20);
        System.out.println(y);

        double z= Math.pow(1, 2);
        System.out.println(z);

        double r = Math.sqrt(9);
        System.out.println(r);

        double ra = Math.round(21.32);
        double ce = Math.ceil(23.32);

        System.out.println(ra );
        System.out.println(ce);
    }
}
