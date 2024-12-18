public class Persona {
    String nombre;
    int edad;

    public Persona (String nom, int edad){
        this.nombre = nom;
        this.edad = edad;
    }

    public String toString(){
        String salida;
        salida = this.nombre + " - " + this.edad;
        return salida;
    }
    
}
