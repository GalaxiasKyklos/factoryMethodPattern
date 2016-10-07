package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoCacheteTest {
    PozoleBlancoCachete pozoleBlancoCachete;
    @Before
    public void setUp() {
        pozoleBlancoCachete = new PozoleBlancoCachete();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Cachete", pozoleBlancoCachete.getName());
    }
}
