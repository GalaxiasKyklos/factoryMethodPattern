package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozoleVerdeConejoTest {
    PozoleVerdeConejo pozoleVerdeConejo;
    @Before
    public void setUp() {
        pozoleVerdeConejo = new PozoleVerdeConejo();
    }
    @Test
    public void nameTest() {
        Assert.assertEquals("Pozole Verde con Conejo", pozoleVerdeConejo.getName());
    }
}
