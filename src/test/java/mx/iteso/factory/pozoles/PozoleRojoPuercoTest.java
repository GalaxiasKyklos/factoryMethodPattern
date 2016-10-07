package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoPuercoTest {
    PozoleRojoPuerco pozoleRojoPuerco;
    @Before
    public void setUp() {
        pozoleRojoPuerco = new PozoleRojoPuerco();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Puerco", pozoleRojoPuerco.getName());
    }
}
