package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;


/**
 * Created by Rodolfo on 06/10/2016.
 */
public class AllPozoleStore {

    public Pozole createPozole(String caldo,String meat) {
        if (caldo.equals("verde")) {
            PozoleVerdeStore verdeStore= new PozoleVerdeStore();
            return verdeStore.createPozole(meat);
        } else if (caldo.equals("rojo")) {
            PozoleRojoStore rojoStore= new PozoleRojoStore();
            return rojoStore.createPozole(meat);
        } else if (caldo.equals("blanco")) {
            PozoleBlancoStore blancoStore= new PozoleBlancoStore();
            return blancoStore.createPozole(meat);
        } else if (caldo.equals("menudo")) {
            MenudoStore menudoStore= new MenudoStore();
            return menudoStore.createPozole(meat);
        } else if (caldo.equals("pozolillo")) {
            PozolilloStore pozolilloStore= new PozolilloStore();
            return pozolilloStore.createPozole(meat);
        }else return null;
    }
}
