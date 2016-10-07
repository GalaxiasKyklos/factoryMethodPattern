package mx.iteso.factory.pozoles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class PozolilloTest {
    @Test
    public void serveTest() {
        Pozolillo pozolillo = new Pozolillo();
        Assert.assertEquals("Serving xtra hot in special pozolillo plate..." , pozolillo.serve());
    }
}
