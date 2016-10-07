package mx.iteso.factory.pozoles;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoOrejaTest {
    PozoleRojoOreja pozoleRojoOreja;
    @Before
    public void setUp() {
        pozoleRojoOreja = new PozoleRojoOreja();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Oreja", pozoleRojoOreja.getName());
    }
}
