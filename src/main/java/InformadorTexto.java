public class InformadorTexto implements Informador{
    private Informador informador;
    @Override
    public void inform(int cantidad) {
        if (informador != null)
            informador.inform(cantidad);
        System.out.println("El envío contiene " + cantidad + "unidades de té\n");

    }
    @Override
    public void inform() {
        if (informador != null)
            informador.inform(0);
        System.out.println("El envío contiene " + 0 + "unidades de té\n");
    }

    @Override
    public void addInformador(Informador nuevoInformador) {
        if (informador == null)
            informador = nuevoInformador;
        else
            informador.addInformador(nuevoInformador);
    }
}
