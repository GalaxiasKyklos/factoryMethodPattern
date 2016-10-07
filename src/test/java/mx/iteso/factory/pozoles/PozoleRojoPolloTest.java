package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoPolloTest {
    PozoleRojoPollo pozoleRojoPollo;
    @Before
    public void setUp() {
        pozoleRojoPollo = new PozoleRojoPollo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Pollo", pozoleRojoPollo.getName());
    }
}
