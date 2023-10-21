
import java.util.HashMap;
import java.util.Scanner;

public class Taller4 {
    static String casa() {
        String Casas[] = {
            "Casa de Honguito",
            "Apartamento de soltero",
            "La casa de los increíbles",
            "La casa de sullyban",
            "La casa de mike wazowski",
        };

        int index = (int) (Math.random() * Casas.length);
        String casitas = Casas[index];
        return casitas;
    }

    static String barrio() {
        String Barrios[] = {
            "Laureles",
            "Loma de los Bernal",
            "Poblado",
            "Belen",
            "La Mota",
        };

        int index = (int) (Math.random() * Barrios.length);
        String lugar = Barrios[index];
        return lugar;
    }

    static String precio() {
        String Precios[] = {
            "5 Millones de Pesos",
            "10 Millones de Euros",
            "15 Millones de Dolares",
            "20 Millones de Bolívares",
            "25 Millones de Yenes",
        };

        int index = (int) (Math.random() * Precios.length);
        String costo = Precios[index];
        return costo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a casitas.com, ingresa tu nombre");
        String name = scanner.nextLine();

        System.out.println("Hola " + name + ". A continuación nuestras ofertas de casas, si deseas comprarlas o no, escribe si/no, escribe si para continuar");
        String continuar = scanner.nextLine();

        if (continuar.equals("si")) {
            HashMap<String, String> propiedades = new HashMap<>();

            for (int i = 1; i <= 5; i++) {
                System.out.println("Casa numero: " + i);
                String propiedad = casa() + " " + barrio() + " " + precio();
                System.out.println(propiedad);
                System.out.println("Deseas comprar? (0 para descartar, 1 para comprar, 2 finalizar)");
                int Responde = scanner.nextInt();
                scanner.nextLine();

                if (Responde == 1) {
                    propiedades.put("Propiedad " + i, propiedad);
                } else if (Responde == 2) {
                    break;
                }
            }

            System.out.println("Propiedades seleccionadas:");
            for (String clave : propiedades.keySet()) {
                String valor = propiedades.get(clave);
                System.out.println(clave + " - Descripción: " + valor);
            }
        }
        scanner.close();
    }
}
