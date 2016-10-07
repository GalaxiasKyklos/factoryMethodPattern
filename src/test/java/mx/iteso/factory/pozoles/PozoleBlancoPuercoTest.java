package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoPuercoTest {
    PozoleBlancoPuerco pozoleBlancoPuerco;
    @Before
    public void setUp() {
        pozoleBlancoPuerco = new PozoleBlancoPuerco();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Puerco", pozoleBlancoPuerco.getName());
    }
}
