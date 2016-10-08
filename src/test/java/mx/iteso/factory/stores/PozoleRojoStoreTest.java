package mx.iteso.factory.stores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rodolfo on 07/10/2016.
 */
public class PozoleRojoStoreTest {
    PozoleRojoStore pozoleRojoStore;
    @Before
    public void setUp() {
        pozoleRojoStore = new PozoleRojoStore();
    }
    @Test
    public void prepareTestCachete() {
        Assert.assertEquals("Pozole Rojo con Cachete", pozoleRojoStore.orderPozole("cachete").getName());
    }
    @Test
    public void prepareTestPollo() {
        Assert.assertEquals("Pozole Rojo con Pollo", pozoleRojoStore.orderPozole("pollo").getName());
    }
    @Test
    public void prepareTestOreja() {
        Assert.assertEquals("Pozole Rojo con Oreja", pozoleRojoStore.orderPozole("oreja").getName());
    }
    @Test
    public void prepareTestPierna() {
        Assert.assertEquals("Pozole Rojo con Pierna", pozoleRojoStore.orderPozole("pierna").getName());
    }
    @Test
    public void prepareTestTrompa() {
        Assert.assertEquals("Pozole Rojo con Trompa", pozoleRojoStore.orderPozole("trompa").getName());
    }
    @Test
    public void prepareTestConejo() {
        Assert.assertEquals("Pozole Rojo con Conejo", pozoleRojoStore.orderPozole("conejo").getName());
    }
    @Test
    public void prepareTestPuerco() {
        Assert.assertEquals("Pozole Rojo con Puerco", pozoleRojoStore.orderPozole("puerco").getName());
    }
    @Test (expected = NullPointerException.class)
    public void nullTest() throws NullPointerException {
        Assert.assertNull(pozoleRojoStore.orderPozole(""));
    }
}
