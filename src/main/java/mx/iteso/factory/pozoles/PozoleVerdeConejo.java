package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Saúl on 06/10/2016.
 */
public class PozoleVerdeConejo extends Pozole {
    public PozoleVerdeConejo() {
        name = "Pozole Verde con Conejo";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
