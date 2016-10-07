package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdeCacheteTest {
    PozoleVerdeCachete pozoleVerdeCachete;
    @Before
    public void setUp() {
        pozoleVerdeCachete = new PozoleVerdeCachete();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Cachete", pozoleVerdeCachete.getName());
    }
}
