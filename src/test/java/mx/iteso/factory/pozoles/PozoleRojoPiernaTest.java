package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoPiernaTest {
    PozoleRojoPierna pozoleRojoPierna;
    @Before
    public void setUp() {
        pozoleRojoPierna = new PozoleRojoPierna();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Pierna", pozoleRojoPierna.getName());
    }
}
