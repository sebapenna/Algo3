package algoEmpires;

import algoEmpires.Mapa;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class MapaTest {

    @Test
    public void crearMapaRectangularAnchoMayorALargo() {
        Mapa mapa = new Mapa(10,5);
        Assert.assertEquals(mapa.getAncho(), 10);
        Assert.assertEquals(mapa.getAlto(), 5);
    }

    @Test
    public void crearMapaRectangularAnchoMenorALargo() {
        Mapa mapa = new Mapa(5,10);
        Assert.assertEquals(mapa.getAncho(), 5);
        Assert.assertEquals(mapa.getAlto(), 10);
    }

    @Test (expected = MapaConDimensionesIncorrectasException.class)
    public void crearMapaConAnchoYLargoCero() {
        Mapa mapa = new Mapa(0,0);
    }

    @Test
    public void crearMapaConTodosLosCasillerosOcupados() {
        Mapa mapa = new Mapa(3,2);
        Assert.assertEquals(mapa.getCantidadCasillerosOcupados(),0);
    }

    @Test
    public void ocuparUnCasillero() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,0);
        Assert.assertEquals(mapa.getCantidadCasillerosOcupados(),1);
    }

    @Test (expected = CasilleroOcupadoException.class)
    public void ocuparUnCasilleroYaOcupado() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,0);
        mapa.ocuparCasillero(0,0);
    }

    @Test
    public void ocuparCasillerosDistintos() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,1);
        mapa.ocuparCasillero(1,1);
        Assert.assertEquals(mapa.getCantidadCasillerosOcupados(),2);
    }

    @Test (expected = CasilleroOcupadoException.class)
    public void ocuparCasillerosDistintosEIntentarOcuparUnoNuevamente() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,1);
        mapa.ocuparCasillero(1,1);
        mapa.ocuparCasillero(0,1);
    }

    @Test
    public void ocuparUnCasilleroYDesocuparlo() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,0);
        mapa.desocuparCasillero(0,0);
        Assert.assertEquals(mapa.getCantidadCasillerosOcupados(),0);
    }

    @Test (expected = CasilleroNoOcupadoException.class)
    public void desocuparCasilleroNoOcupado() {
        Mapa mapa = new Mapa(3,2);
        mapa.desocuparCasillero(0,0);
    }

    @Test
    public void ocuparVariosCasillerosYDesocuparUno() {
        Mapa mapa = new Mapa(3,2);
        mapa.ocuparCasillero(0,0);
        mapa.ocuparCasillero(0,1);
        mapa.ocuparCasillero(1,1);
        mapa.desocuparCasillero(0,1);
        Assert.assertEquals(mapa.getCantidadCasillerosOcupados(),2);
    }

    @Test (expected = PosicionFueraDelMapaException.class)
    public void ocuparCasilleroFueraDelAnchoDelMapa() {
        Mapa mapa = new Mapa(5,2);
        mapa.ocuparCasillero(5,0);
    }

    @Test (expected = PosicionFueraDelMapaException.class)
    public void ocuparCasilleroFueraDelAltoDelMapa() {
        Mapa mapa = new Mapa(5,2);
        mapa.ocuparCasillero(0,2);
    }

    @Test (expected = PosicionFueraDelMapaException.class)
    public void desocuparCasilleroFueraDelAnchoDelMapa() {
        Mapa mapa = new Mapa(5,2);
        mapa.desocuparCasillero(5,0);
    }

    @Test (expected = PosicionFueraDelMapaException.class)
    public void desocuparCasilleroFueraDelAltoDelMapa() {
        Mapa mapa = new Mapa(5,2);
        mapa.desocuparCasillero(0,2);
    }


}
