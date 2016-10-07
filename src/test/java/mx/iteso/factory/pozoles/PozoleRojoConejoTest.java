package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleRojoConejoTest {
    PozoleRojoConejo pozoleRojoConejo;
    @Before
    public void setUp() {
        pozoleRojoConejo = new PozoleRojoConejo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Rojo con Conejo", pozoleRojoConejo.getName());
    }
}
