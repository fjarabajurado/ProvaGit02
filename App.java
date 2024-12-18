public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona ("Carme Riau", 23);
        Persona luisa = new Persona ("Luisa Cerdeña", 32);

        System.out.println(carmen.toString());
        System.out.println( luisa.toString());
    }

}
