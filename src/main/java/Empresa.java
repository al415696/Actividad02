public class Empresa {
    public static void main(String[] args) {
        System.out.println("Demo Empaquetador de Té...");
        ContenedorTeQueInforma envioAsia = GeneradorCajas.generateCajaEj5();
        int numFinal = envioAsia.getCount();
        Informador informadorText = new InformadorTexto();
        Informador informadorEmail = new InformadorEmail();
        envioAsia.addInformador(informadorText);
        envioAsia.addInformador(informadorEmail);
        envioAsia.inform();
    }
}
