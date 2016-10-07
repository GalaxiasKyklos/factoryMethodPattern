package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class MenudoTest {
    @Test
    public void testServe() {
        Menudo menudo = new Menudo();
        Assert.assertEquals("Serving xtra hot in special menudo plate...", menudo.serve());
    }
}
