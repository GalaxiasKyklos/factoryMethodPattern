package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoCacheteTest {
    PozoleRojoCachete pozoleRojoCachete;
    @Before
    public void setUp() {
        pozoleRojoCachete = new PozoleRojoCachete();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Cachete", pozoleRojoCachete.getName());
    }
}
