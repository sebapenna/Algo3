package algoEmpires;

public interface EstadoPlazaCentral {

    void crearAldeano();

    void reparar(PlazaCentral plaza);

    void construir(PlazaCentral plaza);

    int getTurnosConstruccion();
}
