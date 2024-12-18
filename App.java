public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona ("Carme Riau", 23);
        Persona luisa = new Persona ("Luisa Cerdeña", 32);
        Coche renault1 = new Coche("CS-3258", 1999);
        Coche seat1 = new Coche("BU-8563", 1998);

        // Persona

        System.out.println("Persona");
        System.out.println(carmen.toString());
        System.out.println( luisa.toString());

        
        System.out.println("\nCoche");
        System.out.println(renault1.toString());
        System.out.println(seat1.toString());

        // cambio seat1
        seat1.setMatricula("CO-8597");
        System.out.println("Cambio matricula del SEAT");
        System.out.println("Matricula: " + seat1.getMatricula());
        System.out.println(seat1.toString());


    }

}
