
public class Calculatrice {


    public static double addition(double a, double b) {
        return a + b;
    }

   
    public static double soustraction(double a, double b) {
        return a - b;
    }

    
    public static double multiplication(double a, double b) {
        return a * b;
    }

   
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Division par zéro impossible");
            return Double.NaN; 
        return a / b;
    }
    }
    public static void main(String[] args) {
    
        double a = 10;
        double b = 5;
    
        System.out.println("Addition : " + addition(a, b));
        System.out.println("Soustraction : " + soustraction(a, b));
        System.out.println("Multiplication : " + multiplication(a, b));
        System.out.println("Division : " + division(a, b));
    }
}