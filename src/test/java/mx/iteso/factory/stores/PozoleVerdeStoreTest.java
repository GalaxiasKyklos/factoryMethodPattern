package mx.iteso.factory.stores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rodolfo on 07/10/2016.
 */
public class PozoleVerdeStoreTest {
    PozoleVerdeStore pozoleVerdeStore;
    @Before
    public void setUp() {
        pozoleVerdeStore = new PozoleVerdeStore();
    }
    @Test
    public void prepareTestCachete() {
        Assert.assertEquals("Pozole Verde con Cachete", pozoleVerdeStore.orderPozole("cachete").getName());
    }
    @Test
    public void prepareTestPollo() {
        Assert.assertEquals("Pozole Verde con Pollo", pozoleVerdeStore.orderPozole("pollo").getName());
    }
    @Test
    public void prepareTestOreja() {
        Assert.assertEquals("Pozole Verde con Oreja", pozoleVerdeStore.orderPozole("oreja").getName());
    }
    @Test
    public void prepareTestPierna() {
        Assert.assertEquals("Pozole Verde con Pierna", pozoleVerdeStore.orderPozole("pierna").getName());
    }
    @Test
    public void prepareTestTrompa() {
        Assert.assertEquals("Pozole Verde con Trompa", pozoleVerdeStore.orderPozole("trompa").getName());
    }
    @Test
    public void prepareTestConejo() {
        Assert.assertEquals("Pozole Verde con Conejo", pozoleVerdeStore.orderPozole("conejo").getName());
    }
    @Test
    public void prepareTestPuerco() {
        Assert.assertEquals("Pozole Verde con Puerco", pozoleVerdeStore.orderPozole("puerco").getName());
    }
    @Test (expected = NullPointerException.class)
    public void nullTest() throws NullPointerException {
        Assert.assertNull(pozoleVerdeStore.orderPozole(""));
    }
}
