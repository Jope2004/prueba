import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hola cual es tu nombre?");
         String nom = scanner.nextLine();

        System.out.println("Hola "+ nom + " vamos a hacer un arreglo");

        int suma = 0;
        int jugar0;
        jugar0 = (int)(Math.random()*20)+ 10;
        int[] array = new int[jugar0];

        for(int a = 0;  a < array.length; a++){
            int randomContent=(int)(Math.random()*11)+10;
            array[a] = randomContent;
        }

        for (int a : array) {
            suma += a;
            
        }
        System.out.println("El tamaño del array es "+ array.length );
        System.out.println("La sumatoria es "+ suma );
        
      scanner.close();
    }
}
