package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoConejoTest {
    PozoleBlancoConejo pozoleBlancoConejo;
    @Before
    public void setUp() {
        pozoleBlancoConejo = new PozoleBlancoConejo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Conejo", pozoleBlancoConejo.getName());
    }
}
