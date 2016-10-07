package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdeTrompaTest {
    PozoleVerdeTrompa pozoleVerdeTrompa;
    @Before
    public void setUp() {
        pozoleVerdeTrompa = new PozoleVerdeTrompa();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Trompa", pozoleVerdeTrompa.getName());
    }
}
