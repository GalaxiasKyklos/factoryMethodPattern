package mx.iteso.factory.stores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rodolfo on 07/10/2016.
 */
public class AllPozoleStoreTest {
    AllPozoleStore allPozoleStore;
    @Before
    public void setUp() {
        allPozoleStore = new AllPozoleStore();
    }
    @Test
    public void prepareTestVerde() {
        Assert.assertEquals("Pozole Verde con Cachete", allPozoleStore.createPozole("verde","cachete").getName());
    }
    @Test
    public void prepareTestBlanco() {
        Assert.assertEquals("Pozole Blanco con Cachete", allPozoleStore.createPozole("blanco","cachete").getName());
    }
    @Test
    public void prepareTestRojo() {
        Assert.assertEquals("Pozole Rojo con Cachete", allPozoleStore.createPozole("rojo","cachete").getName());
    }
    @Test
    public void prepareTestMenudo() {
        Assert.assertEquals("Menudo", allPozoleStore.createPozole("menudo","cachete").getName());
    }
    @Test
    public void prepareTestPozolillo() {
        Assert.assertEquals("Pozolillo", allPozoleStore.createPozole("pozolillo","cachete").getName());
    }


}
