import java.util.Scanner;

public class Usuario {
    private static final Object sesion2 = null;

    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner (System.in);

      final int mayor = 18;  

        System.out.println("Ingresa tu nombre porfavor.");
         String nombre = scanner.nextLine();

        System.out.println("Hola "+ nombre + " Porfavor crea tu usuario.");
         String user = scanner.nextLine();

        System.out.println("Ahora "+ nombre + " Porfavor cra tu contraseña.");
         String contraseña = scanner.nextLine();

        do{
            System.out.println("Muy bien "+ nombre + "Iniciemos sesion, INGRESA USUARIO.");
            String sesion1 = scanner.nextLine();
         
        }while(!sesion1.equals(user));
        do{
        System.out.println("INGRESA CONTRASEÑA.");
         String sesion2 = scanner.nextLine();
         
        }while(sesion2.equals(contraseña)){
            System.out.println("Contraseña correcta");
         } 
            System.out.println("Contraseña incorrecta vuelve a intentar");
         
        
         System.out.print("Ingresa tu edad.");
          int edad = scanner.nextInt();
        
         if(edad>=mayor){
            System.out.println("Acceso concedido.");

         int minNumber = 1;
         int maxNumber = 100;
         int range = maxNumber - minNumber + 1;
         int random = (int) (Math.random() * range) + minNumber;
          System.out.println(random);

         }
        scanner.close();
    }
}
