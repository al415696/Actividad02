import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CajaTe implements ContenedorTe{
    private List<ContenedorTe> listaContenedores = new ArrayList<ContenedorTe>();
    private int maxCotenedores;
    private String tipoCaja;

    public CajaTe( int maxCotenedores, String tipoCaja) {
        this.listaContenedores = new ArrayList<>();
        this.maxCotenedores = maxCotenedores;
        this.tipoCaja = tipoCaja;
    }


    @Override
    public int getCount() {
        int count = 0;
        for (ContenedorTe contenedorActual : listaContenedores) {
            count += contenedorActual.getCount();
        }
        if (tipoCaja.equals("Paquete de cajas"))
            System.out.println("Este paquete consta de " + count + " unidades");
        return count;
    }

    @Override
    public String getTipo() {
        return tipoCaja;
    }

    public void addContenedor(ContenedorTe contenedor){
        if (listaContenedores.size() != maxCotenedores){
            listaContenedores.add(contenedor);
            if (!Objects.equals(contenedor.getTipo(), "bolsa"))
                System.out.println("Añado una caja de " + contenedor.getTipo());
        }


    }
    public void removeContenedor(ContenedorTe contenedor){
        listaContenedores.remove(contenedor);
        if (!Objects.equals(contenedor.getTipo(), "bolsa"))
            System.out.println("Quito una caja de " + contenedor.getTipo());

    }
}
