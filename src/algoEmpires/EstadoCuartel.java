package algoEmpires;

public interface EstadoCuartel {

    void crearEspadachin();

    void crearArquero();

    void reparar(Cuartel cuartel);

    void construir(Cuartel cuartel);

    int getTurnosConstruccion();
}
