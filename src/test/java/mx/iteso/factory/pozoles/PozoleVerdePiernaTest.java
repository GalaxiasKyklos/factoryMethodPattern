package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdePiernaTest {
    PozoleVerdePierna pozoleVerdePierna;
    @Before
    public void setUp() {
        pozoleVerdePierna = new PozoleVerdePierna();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Pierna", pozoleVerdePierna.getName());
    }
}
