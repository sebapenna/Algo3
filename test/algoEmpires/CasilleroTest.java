package algoEmpires;

import algoEmpires.Casillero;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CasilleroTest {

    @Test
    public void crearCasilleroDesocupado() {
        Casillero casillero = new Casillero();
        Assert.assertFalse(casillero.estaOcupado());
    }

    @Test
    public void ocuparCasillero() {
        Casillero casillero = new Casillero();
        casillero.ocupar();
        Assert.assertTrue(casillero.estaOcupado());
    }

    @Test (expected = CasilleroOcupadoException.class)
    public void ocuparDosVecesCasillero() {
        Casillero casillero = new Casillero();
        casillero.ocupar();
        casillero.ocupar();
    }

    @Test
    public void ocuparYDesocuparCasillero() {
        Casillero casillero = new Casillero();
        casillero.ocupar();
        casillero.desocupar();
        Assert.assertFalse(casillero.estaOcupado());
    }

    @Test (expected = CasilleroNoOcupadoException.class)
    public void desocuparCasilleroDesocupado() {
        Casillero casillero = new Casillero();
        casillero.desocupar();
    }
}
