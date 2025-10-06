package org.example;

public class Estudiante {
    // Atributos de la clase "Estudiante"
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean matriculado;

    // Constructor de la clase "Estudiante"
    public Estudiante(String nombre, int edad, double notaMedia, boolean matriculado) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setNotaMedia(notaMedia);
        this.setMatriculado(matriculado);
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

    // Setters de la clase "Estudiante"
    private void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }
    private void setEdad(int edad) {
        if (edad >= 1 && edad <= 100) {
            this.edad = edad;
        }
    }
    private void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 || notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }
    private void setMatriculado(boolean matriculado) {
        if (matriculado == true || matriculado == false) {
            this.matriculado = matriculado;
        }
    }

    // Funciones de la clase "Estudiante"
    public String mostrarDatos() {
        String datos = this.nombre + " (" + this.edad + " años) - Nota media: " + this.notaMedia + " - Matriculado: " + this.matriculado;
        return datos;
    }
}
