package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoPiernaTest {
    PozoleBlancoPierna pozoleBlancoPierna;
    @Before
    public void setUp() {
        pozoleBlancoPierna = new PozoleBlancoPierna();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Pierna", pozoleBlancoPierna.getName());
    }
}
