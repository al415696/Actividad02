public class DecoradorCajas {
    private static final int BOLSAS_EN_TE_VERDE = 24;
    private static final int BOLSAS_EN_TE_BLANCO = 60;
    public static ContenedorTe generateCajaEj3(){
        CajaTe caja1 = new CajaTe(3, "Paquete de cajas");
        caja1.addContenedor(generateCajaTeBlanco());
        caja1.addContenedor(generateCajaTeBlanco());
        caja1.addContenedor(generateCajaTeVerde());
        CajaTe caja2 = new CajaTe(3, "Paquete de cajas");
        caja2.addContenedor(generateCajaTeVerde());
        caja2.addContenedor(generateCajaTeVerde());
        caja2.addContenedor(generateCajaTeBlanco());
        CajaTe cajaFinal = new CajaTe(2, "Paquete de cajas");
        cajaFinal.addContenedor(caja1);
        cajaFinal.addContenedor(caja2);
        return cajaFinal;
    }
    private static ContenedorTe generateCajaTeBlanco(){
        CajaTe caja = new CajaTe(BOLSAS_EN_TE_BLANCO,"Te Blanco");
        for (int i = 0; i < BOLSAS_EN_TE_BLANCO; i++) {
            caja.addContenedor(new BolsaTe());
        }
        return caja;
    }
    private static ContenedorTe generateCajaTeVerde(){
        CajaTe caja = new CajaTe(BOLSAS_EN_TE_VERDE,"Te Verde");
        for (int i = 0; i < BOLSAS_EN_TE_VERDE; i++) {
            caja.addContenedor(new BolsaTe());
        }
        return caja;
    }
}
