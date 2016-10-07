package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdePuercoTest {
    PozoleVerdePuerco pozoleVerdePuerco;
    @Before
    public void setUp() {
        pozoleVerdePuerco = new PozoleVerdePuerco();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Puerco", pozoleVerdePuerco.getName());
    }
}
