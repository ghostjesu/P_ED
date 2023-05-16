
public class Calculadora {
    
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
    
    public int restar(int num1, int num2) {
        return num1 - num2;
    }
    
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }
}
