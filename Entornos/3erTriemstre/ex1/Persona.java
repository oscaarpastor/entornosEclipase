package ex1;

public class Persona {
	
    private String numeroDeTelefono;
    
    // Constructor
    public Persona(String numeroDeTelefono) {	
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    // Getter y setter
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}