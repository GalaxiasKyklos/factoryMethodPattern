package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdePolloTest {
    PozoleVerdePollo pozoleVerdePollo;
    @Before
    public void setUp() {
        pozoleVerdePollo = new PozoleVerdePollo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Pollo", pozoleVerdePollo.getName());
    }
}
