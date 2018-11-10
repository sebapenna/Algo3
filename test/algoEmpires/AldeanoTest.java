package algoEmpires;

import algoEmpires.Aldeano;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class AldeanoTest {

    private Aldeano aldeano;

    @Before
    public void setUp() throws Exception {
        aldeano = new Aldeano();
    }

    @Test
    public void crearAldeanoConVidaCorrecta() {
        Assert.assertEquals(aldeano.getVida(),50);
    }

    @Test
    public void crearAldeanoConCostoCorrecto() {
        Assert.assertEquals(aldeano.getCosto(),25);
    }

    @Test
    public void reducirLaVida() {
        aldeano.reducirVida(10);
        Assert.assertEquals(aldeano.getVida(),40);
    }

    @Test (expected = AldeanoSinVidaException.class)
    public void intentarQuitarVidaCuandoYaEsCero() {
        aldeano.reducirVida(50);
        aldeano.reducirVida(10);
    }
}
