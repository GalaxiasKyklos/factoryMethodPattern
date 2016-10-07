package mx.iteso.factory.pozoles;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdeOrejaTest {
    PozoleVerdeOreja pozoleVerdeOreja;
    @Before
    public void setUp() {
        pozoleVerdeOreja = new PozoleVerdeOreja();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Oreja", pozoleVerdeOreja.getName());
    }
}
