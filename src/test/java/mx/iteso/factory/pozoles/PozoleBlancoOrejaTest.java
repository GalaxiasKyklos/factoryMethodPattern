package mx.iteso.factory.pozoles;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoOrejaTest {
    PozoleBlancoOreja pozoleBlancoOreja;
    @Before
    public void setUp() {
        pozoleBlancoOreja = new PozoleBlancoOreja();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Oreja", pozoleBlancoOreja.getName());
    }
}
