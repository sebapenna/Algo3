package algoEmpires;

public class PlazaCentral extends Edificio {

    public static final int VIDA = 450;
    public static final int COSTO = 100;
    public static final int VELOCIDAD_REPARACION = 25;

    private EstadoPlazaCentral estado;

    public PlazaCentral() {
        this.vidaMax = VIDA;
        this.vida = 0;
        this.costo = COSTO;
        this.velocidadReparacion = VELOCIDAD_REPARACION;
        this.estado = new EstadoPlazaCentralEnConstruccion();
    }

    @Override
    public void reparar() {
        this.estado.reparar(this);
    }

    public int getCosto() {
        return this.costo;
    }

    public void crearAldeano() {
        this.estado.crearAldeano();
    }

    public void construir() {
        this.estado.construir(this);
    }

    protected void finalizarConstruccion() {
        this.vida = VIDA;
        this.estado = new EstadoPlazaCentralConstruida();
    }

    public int getTurnosNecesariosConstruccion() {
        return this.estado.getTurnosConstruccion();
    }

}
