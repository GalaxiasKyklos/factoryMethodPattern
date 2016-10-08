package mx.iteso.factory.stores;

import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rodolfo on 07/10/2016.
 */
public class PozolilloStoreTest {
    PozolilloStore pozolilloStore;
    @Before
    public void setUp() {
        pozolilloStore = new PozolilloStore();
    }
    @Test
    public void prepareTest() {
        Assert.assertEquals("Pozolillo", pozolilloStore.orderPozole("").getName());
    }
}
