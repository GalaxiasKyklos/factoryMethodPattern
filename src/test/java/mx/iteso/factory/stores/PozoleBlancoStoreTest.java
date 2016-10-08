package mx.iteso.factory.stores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rodolfo on 07/10/2016.
 */
public class PozoleBlancoStoreTest {
    PozoleBlancoStore pozoleBlancoStore;
    @Before
    public void setUp() {
        pozoleBlancoStore = new PozoleBlancoStore();
    }
    @Test
    public void prepareTestCachete() {
        Assert.assertEquals("Pozole Blanco con Cachete", pozoleBlancoStore.orderPozole("cachete").getName());
    }
    @Test
    public void prepareTestPollo() {
        Assert.assertEquals("Pozole Blanco con Pollo", pozoleBlancoStore.orderPozole("pollo").getName());
    }
    @Test
    public void prepareTestOreja() {
        Assert.assertEquals("Pozole Blanco con Oreja", pozoleBlancoStore.orderPozole("oreja").getName());
    }
    @Test
    public void prepareTestPierna() {
        Assert.assertEquals("Pozole Blanco con Pierna", pozoleBlancoStore.orderPozole("pierna").getName());
    }
    @Test
    public void prepareTestTrompa() {
        Assert.assertEquals("Pozole Blanco con Trompa", pozoleBlancoStore.orderPozole("trompa").getName());
    }
    @Test
    public void prepareTestConejo() {
        Assert.assertEquals("Pozole Blanco con Conejo", pozoleBlancoStore.orderPozole("conejo").getName());
    }
    @Test
    public void prepareTestPuerco() {
        Assert.assertEquals("Pozole Blanco con Puerco", pozoleBlancoStore.orderPozole("puerco").getName());
    }
    @Test (expected = NullPointerException.class)
    public void nullTest() throws NullPointerException {
        Assert.assertNull(pozoleBlancoStore.orderPozole(""));
    }
}
