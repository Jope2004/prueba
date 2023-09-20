import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Le pedimos al usuario su nombre
        System.out.println("Hola, ingresa tu nombre:");
        String nom = scanner.nextLine(); // Leemos

        double sumaTotal = 0; // Variable para almacenar la suma total de todas las materias
        int totalMaterias; // Variable para almacenar la cantidad de materias

       
            // Pedimos al usuario la cantidad de materias que desea calcular
            System.out.print(nom + ", ¿Cuántas materias vas a calcular? ");
            totalMaterias = scanner.nextInt();

         // Comenzamos el ciclo para calcular una o más materias según el usuario
        while (true) {
           
            // Arreglo para las materias 
            String[] nombresMaterias = new String[totalMaterias];

            // Limpiamos el búfer de entrada
            scanner.nextLine();

            // Ciclo para calcular cada materia
            for (int i = 0; i < totalMaterias; i++) {
                // Pedimos el nombre de la materia
                System.out.println("Ingresa el nombre de la materia #" + (i + 1) + ":");
                nombresMaterias[i] = scanner.nextLine();

                // Preguntamos el número de notas que van a ingresar
                System.out.println("¿Cuántas notas son de " + nombresMaterias[i] + "?");
                int cantidadNotas = scanner.nextInt();

                // Arreglos de notas y porcentajes para esta materia
                double[] notasMateria = new double[cantidadNotas];
                double[] porcentajesMateria = new double[cantidadNotas];

                // Ciclo para ingresar las notas y porcentajes de esta materia
                for (int a = 0; a < cantidadNotas; a++) {
                    System.out.println("Ingresa la nota #" + (a + 1) + " para " + nombresMaterias[i] + ":");
                    notasMateria[a] = scanner.nextDouble(); // Leemos
                    System.out.println("Ingresa el porcentaje de la nota #" + (a + 1) + " para " + nombresMaterias[i] + ":");
                    porcentajesMateria[a] = scanner.nextDouble(); // Leemos
                }

                // Calcular la nota final para esta materia
                double sumaNotasMateria = 0;
                // Ciclo
                for (int b = 0; b < cantidadNotas; b++) {
                    sumaNotasMateria += (notasMateria[b] * (porcentajesMateria[b] / 100)); // Operacion
                }

                // Mostrar la nota final de esta materia
                System.out.println(nom + ", tu nota final en " + nombresMaterias[i] + " es: " + sumaNotasMateria);

                // Agregar la nota final de esta materia a la suma total
                sumaTotal += sumaNotasMateria;
            }

            // Calcular el promedio de todas las materias
            double promedio = sumaTotal / totalMaterias;

            // Mostrar el promedio
            System.out.println(nom + ", tu promedio de todas las materias es: " + promedio);

            break;
        }

        scanner.close();
    }
}