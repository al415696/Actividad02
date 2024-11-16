public class Empresa {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");
        ContenedorTe envioAsia = DecoradorCajas.generateCajaEj3();
        int numFinal = envioAsia.getCount();
        System.out.println("El envío a Asia contiene "+ numFinal +" unidades de té");
    }
}
