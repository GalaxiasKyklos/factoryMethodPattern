package mx.iteso.factory.stores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 07/10/2016.
 */
public class MenudoStoreTest {
    MenudoStore menudoStore;
    @Before
    public void setUp() {
        menudoStore = new MenudoStore();
    }
    @Test
    public void prepareTest() {
        Assert.assertEquals("Menudo", menudoStore.createPozole("").getName());
    }
}
