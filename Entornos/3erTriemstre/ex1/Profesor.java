package ex1;

import java.util.ArrayList;

public class Profesor extends Persona {
    
    private String nombre;
    private int edad;
    private String numeroDeTelefono;
    ArrayList<Prestamo> prestamos;
    
    //Constructor
    public Profesor(String nombre, int edad, String numeroDeTelefono, ArrayList<Prestamo> prestamos) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
        this.prestamos = prestamos;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    //----------------
    
    public void printInformacionPersonal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + numeroDeTelefono);
    }
    
    public void printListaPrestamos() {
        if (prestamos == null) {
            System.out.println("No hay préstamos registrados.");
            return;
        }
        
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}
