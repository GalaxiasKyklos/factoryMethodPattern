package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Saúl on 06/10/2016.
 */
public class PozoleVerdePuerco extends Pozole {
    public PozoleVerdePuerco() {
        name = "Pozole Verde con Puerco";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
