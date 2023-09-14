import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

         System.out.println("Ingresa a ");
         double operador1 = scanner.nextDouble();
 
         System.out.println("Ingresa b ");
         double operador2 = scanner.nextDouble();
 
         double suma = (operador1 + operador2);
 
         System.out.println("El Resultado de la suma entre a y b es " + suma);
 
         double resta = (operador1 - operador2);
 
         System.out.println("El Resultado de la resta entre a y b es " + resta);
 
         double multi = (operador1 * operador2);
 
         System.out.println("El Resultado de la mutiplicacion entre a y b es " + multi);
 
         double divi = (operador1 / operador2);
 
         System.out.println("El Resultado de la division de a entre b es: " + divi);

        scanner.close();
    }
}
