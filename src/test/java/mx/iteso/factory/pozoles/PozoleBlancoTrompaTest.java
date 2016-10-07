package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleBlancoTrompaTest {
    PozoleBlancoTrompa pozoleBlancoTrompa;
    @Before
    public void setUp() {
        pozoleBlancoTrompa = new PozoleBlancoTrompa();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Blanco con Trompa", pozoleBlancoTrompa.getName());
    }
}
