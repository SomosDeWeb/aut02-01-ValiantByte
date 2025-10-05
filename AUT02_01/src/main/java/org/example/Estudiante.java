package org.example;

public class Estudiante {
    // Atributos de la clase "Estudiante"
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean matriculado;

    // Constructor de la clase "Estudiante"
    public Estudiante(String nombre, int edad, double notaMedia, boolean matriculado) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.matriculado = matriculado;
    }

    // Getters de la clase "Estudiante"
    public String getNombre() {
        return this.nombre.toUpperCase();
    }
    public int getEdad() {

        return this.edad;
    }
    public double getNotaMedia() {

        return this.notaMedia;
    }
    public boolean getMatriculado() {

        return this.matriculado;
    }

    // Funciones de la clase "Estudiante"
    public void mostrarDatos() {
        System.out.println(this.nombre + " (" + this.edad + " años) - Nota media: " + this.notaMedia + " - Matriculado: " + this.matriculado);
    }
}
