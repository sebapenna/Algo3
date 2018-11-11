package algoEmpires;

public class EstadoCuartelConstruido implements EstadoCuartel {

    @Override
    public void crearEspadachin() {
//        Espadachin espadachin = new Espadachin();
//
//        FALTA DEFINIR QUE SE HACE ACA
        return;
    }
//
    @Override
    public void crearArquero() {
//        Arquero espadachin = new Arquero();
//
//        FALTA DEFINIR QUE SE HACE ACA

    }

    @Override
    public void reparar(Cuartel cuartel) {
        if (cuartel.vida == cuartel.vidaMax)
            throw new EdificioConVidaAlMaximoException();
        if ((cuartel.vida + cuartel.velocidadReparacion) >= cuartel.vidaMax)
            cuartel.vida = cuartel.vidaMax;
        else
            cuartel.vida += cuartel.velocidadReparacion;
    }

    @Override
    public void construir(Cuartel cuartel) {
        throw new EdificioYaConstruidoException();
    }

    @Override
    public int getTurnosConstruccion() {
        throw new EdificioYaConstruidoException();
    }
}
