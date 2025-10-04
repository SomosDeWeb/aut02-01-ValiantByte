package org.example;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class GestorDeEstudiantes {
    public static void main(String[] args) {

        // Programa
        System.out.println("=== Gestor de Estudiantes ===\n1. Añadir estudiante\n2. Listar estudiantes\n3. Buscar por nombre\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir");
        switch (comprobarOpcion()) {
            case 1:

                break
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
        }
    }
    // Funcion para no salir del rango del 1-6 y volver a peguntar
    public static int comprobarOpcion() {
        // Variables
        Scanner sc = new Scanner(System.in);
        boolean nCorrecto = false;
        int opcionDelUsuario;

        // Programa
        do {
            System.out.print("Seleccione opción: ");
            opcionDelUsuario = sc.nextInt(); sc.nextLine();
            if (opcionDelUsuario > 1 && opcionDelUsuario < 6) {
                nCorrecto = true;
            }
            else System.out.println("Solo se admite del 1-6, vuelva a intentarlo");
        } while (!nCorrecto);
        return opcionDelUsuario;
    }
}