package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoPolloTest {
    PozoleBlancoPollo pozoleBlancoPollo;
    @Before
    public void setUp() {
        pozoleBlancoPollo = new PozoleBlancoPollo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Pollo", pozoleBlancoPollo.getName());
    }
}
