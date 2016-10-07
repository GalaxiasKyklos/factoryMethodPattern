package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoTrompaTest {
    PozoleRojoTrompa pozoleRojoTrompa;
    @Before
    public void setUp() {
        pozoleRojoTrompa = new PozoleRojoTrompa();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Trompa", pozoleRojoTrompa.getName());
    }
}
