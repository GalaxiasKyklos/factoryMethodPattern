package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Saúl on 06/10/2016.
 */
public class PozoleRojoConejo extends Pozole {
    public PozoleRojoConejo() {
        name = "Pozole Rojo con Conejo";
        broth = "Caldo Rojo";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
