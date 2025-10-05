package org.example;
import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeEstudiantes {
    public static void main(String[] args) {
        // Variables
        ArrayList<Estudiante> Estudiantes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        int opcionDelusuario;
        int pos;
        double notaMedia;
        double notaMediaTotal = 0;
        boolean encontrado = false;
        boolean matriculado;

        // Programa
        do {
            // Muestra por la terminal el menu y pide que hacer al usuario
            System.out.println("\n=============================\n=== Gestor de Estudiantes ===\n1. Añadir estudiante\n2. Listar estudiantes\n3. Buscar por nombre\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir");
            opcionDelusuario = comprobarOpcion();
            // Switch para el menu
            switch (opcionDelusuario) {
                // Añadir un estudiante
                case 1:
                    System.out.print("\nIntroduce nombre: ");
                    nombre = sc.nextLine();
                    do {
                        System.out.print("Introduce edad (1-100): ");
                        edad = sc.nextInt();
                        sc.nextLine();
                    } while (edad < 1 || edad > 100);
                    do {
                        System.out.print("Introduce nota media (0-10): ");
                        notaMedia = sc.nextDouble();
                        sc.nextLine();
                    } while (notaMedia < 0 || notaMedia > 10);
                    System.out.print("¿Está matriculado? (true/false): ");
                    matriculado = sc.nextBoolean();
                    sc.nextLine();
                    Estudiante obj = new Estudiante(nombre, edad, notaMedia, matriculado);
                    Estudiantes.add(obj);
                    System.out.println("Estudiante añadido correctamente.");
                    break;
                // Listar los estudiantes
                case 2:
                    if (Estudiantes.size() == 0) System.out.println("\nNo hay estudiantes en la lista");
                    else {
                        System.out.println("\nListado de estudiantes:");
                        for (int i = 0; i < Estudiantes.size(); i++) {
                            Estudiantes.get(i).mostrarDatos();
                        }
                    }
                    break;
                // Buscar por nombre
                case 3:
                    if (Estudiantes.size() == 0) System.out.println("\nNo hay estudiantes en la lista");
                    else {
                        System.out.print("\nNombre del estudiante a buscar: ");
                        nombre = sc.nextLine();
                        for (int i = 0; i < Estudiantes.size(); i++) {
                            if (Estudiantes.get(i).getNombre().equals(nombre.toUpperCase())) {
                                System.out.println("\nEstudiante encontrado");
                                Estudiantes.get(i).mostrarDatos();
                                encontrado = true;
                            }
                        }
                        if (!encontrado) System.out.println("\nEstudiante no encontrado");
                    }
                    break;
                // Calcular nota media general
                case 4:

                    break;
                // Mostrar mejor estudiante
                case 5:

                    break;
                // Salir
                case 6:
                    
                    break;
            }
        } while (opcionDelusuario != 6);
    }

    // Funciones de la clase "Main"
    public static int comprobarOpcion() {
        Scanner sc = new Scanner(System.in);
        boolean nCorrecto = false;
        int opcionDelUsuario;
        do {
            System.out.print("Seleccione opción: ");
            opcionDelUsuario = sc.nextInt(); sc.nextLine();
            if (opcionDelUsuario >= 1 && opcionDelUsuario <= 6) {
                nCorrecto = true;
            }
            else System.out.println("Solo se admite del 1-6, vuelva a intentarlo");
        } while (!nCorrecto);
        return opcionDelUsuario;
    }
}