package algoEmpires;

public abstract class Unidad {

    protected int vida;
    protected int costo;

    public int getVida() {
        return this.vida;
    }

    public int getCosto() {
        return this.costo;
    }

    public void reducirVida(int cant) {
        if (this.vida <= 0)
            throw new AldeanoSinVidaException();
        this.vida -= cant;
    }
}
