import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        // Scanner para leer entradas desde la consola
        Scanner scanner = new Scanner(System.in);
        
        // Bucle que repite la solicitud de entrada hasta que el usuario decida salir
        while (true) {
            // Solicitar al usuario el ingreso de una letra
            System.out.print("Ingrese una letra (o 'q' para salir): ");
            char ch = scanner.next().toLowerCase().charAt(0);
            
            // Verificar si el usuario quiere salir
            if (ch == 'q') {
                System.out.println("Programa terminado.");
                break;
            }
            
            // Comprobar si la entrada es una vocal o una consonante
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " es una vocal.");
            } else if ((ch >= 'a' && ch <= 'z')) {
                System.out.println(ch + " es una consonante.");
            } else {
                System.out.println("Entrada no válida. Ingrese una letra válida.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
