public class InformadorEmail implements Informador{
    private Informador informador;
    @Override
    public void inform(int cantidad) {
        if (informador != null)
            informador.inform(cantidad);
        //enviar email

    }

    @Override
    public void inform() {
        if (informador != null)
            informador.inform(0);
        //enviar email
    }

    @Override
    public void addInformador(Informador nuevoInformador) {
        if (informador == null)
            informador = nuevoInformador;
        else
            informador.addInformador(nuevoInformador);
    }
}
