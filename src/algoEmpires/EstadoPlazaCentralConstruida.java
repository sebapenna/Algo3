package algoEmpires;

public class EstadoPlazaCentralConstruida implements EstadoPlazaCentral {

    @Override
    public void crearAldeano() {
        Aldeano aldeano = new Aldeano();
//
//        FALTA DEFINIR QUE SE HACE ACA
//
    }

    @Override
    public void reparar(PlazaCentral plaza) {
        if (plaza.vida == plaza.vidaMax)
            throw new EdificioConVidaAlMaximoException();
        if ((plaza.vida + plaza.velocidadReparacion) >= plaza.vidaMax)
            plaza.vida = plaza.vidaMax;
        else
            plaza.vida += plaza.velocidadReparacion;
    }

    @Override
    public void construir(PlazaCentral plaza) {
        throw new EdificioYaConstruidoException();
    }

    @Override
    public int getTurnosConstruccion() {
        throw new EdificioYaConstruidoException();
    }
}
