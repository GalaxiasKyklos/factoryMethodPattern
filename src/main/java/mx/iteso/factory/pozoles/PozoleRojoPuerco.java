package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Saúl on 06/10/2016.
 */
public class PozoleRojoPuerco extends Pozole {
    public PozoleRojoPuerco() {
        name = "Pozole Rojo con Puerco";
        broth = "Caldo Rojo";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
