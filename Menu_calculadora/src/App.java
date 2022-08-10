import java.util.Scanner;

public class App {

    public static double sumar(double num1, double num2) {
        double resul;
        resul = num1 + num2;
        return resul;
    }

    public static double restar(double num1, double num2) {
        double resul;
        resul = num1 - num2;
        return resul;
    }

    public static double multi(double num1, double num2) {
        double resul;
        resul = num1 * num2;
        return resul;
    }

    public static double div(double num1, double num2) {
        double resul;
        resul = num1 / num2;
        return resul;
    }

    public static double mod(double num1, double num2) {
        double resul;
        resul = num1 % num2;
        return resul;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String seleccion_de_operacion = "";
        double numero1 = 0, numero2 = 0, resultado = 0;

        do {
            System.out.println("\n");
            System.out.print("Ingrese primer número: ");
            numero1 = input.nextDouble();
            System.out.println("\n");
            System.out.println("Seleccione un número de operación a realizar: ");
            System.out.println("+ (Sumar)");
            System.out.println("- (Restar)");
            System.out.println("* (Multiplicar)");
            System.out.println("/ (Dividir)");
            System.out.println("% (Módulo de la división)");
            System.out.println("S (Acabar programa)");
            seleccion_de_operacion = input.next();
            switch (seleccion_de_operacion) {
                case "+":
                    System.out.print("Ingrese segundo número: ");
                    numero2 = input.nextDouble();
                    resultado = sumar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "-":
                    System.out.print("Ingrese segundo número: ");
                    numero2 = input.nextDouble();
                    resultado = restar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "*":
                    System.out.print("Ingrese segundo número: ");
                    numero2 = input.nextDouble();
                    resultado = multi(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "/":
                    System.out.print("Ingrese segundo número: ");
                    numero2 = input.nextDouble();
                    if (numero2 == 0) {
                        System.out.println("No puedo dividir entre cero");
                    } else {
                        resultado = div(numero1, numero2);
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;
                case "%":
                    System.out.print("Ingrese segundo número: ");
                    numero2 = input.nextDouble();
                    if (numero2 == 0) {
                        System.out.println("No puedo sacar modulo por cero");
                    } else {
                        resultado = mod(numero1, numero2);
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;
                case "S":
                    System.out.println("Gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("La opción ingresada no es elegible");
            }
        } while (seleccion_de_operacion != "S");
    }
}
