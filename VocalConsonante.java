/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalconsonante;

import java.util.Scanner;

/**
 *
 * @author crabb
 */
public class VocalConsonante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bucle que repite la solicitud de entrada hasta que el usuario decida salir
        try ( // Crear un objeto Scanner para leer entradas desde la consola
                Scanner scanner = new Scanner(System.in)) {
            // Bucle que repite la solicitud de entrada hasta que el usuario decida salir
            while (true) {
                // Solicitar al usuario el ingreso de una letra
                System.out.print("Ingrese una letra (o 'q' para salir): ");
                String input = scanner.nextLine().trim();  // Leer la entrada y quitar espacios extra
                
                // Si el usuario ingresa 'q', terminar el programa
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Programa terminado.");
                    break;  // Salir del bucle
                }
                
                // Verificar si la entrada tiene exactamente una letra
                if (input.length() != 1) {
                    System.out.println("Por favor, ingrese solo una letra.");
                    continue;  // Volver a pedir la entrada
                }
                
                // Obtener el primer carácter ingresado y convertirlo a minúscula
                char ch = input.toLowerCase().charAt(0);
                
                // Verificar si el carácter es una letra válida (entre 'a' y 'z')
                if (ch >= 'a' && ch <= 'z') {
                    // Determinar si es una vocal
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println(ch + " es una vocal.");
                    } else {
                        // Si no es una vocal, entonces es una consonante
                        System.out.println(ch + " es una consonante.");
                    }
                } else {
                    // Si la entrada no es una letra, informamos al usuario
                    System.out.println("Entrada no válida. Ingrese una letra del abecedario.");
                }
            }
            // Cerrar el scanner al final
        }
    }
    
}
