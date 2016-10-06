package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Saúl on 06/10/2016.
 */
public class Pozolillo extends Pozole {
    public Pozolillo() {
        name = "Pozolillo";
        broth = "Caldo Verde";
        toppings.add("Lechuga");
        toppings.add("Col");
        toppings.add("Rabanos");
    }

    @Override
    public void serve() {
        System.out.println("Serving xtra hot in special pozolillo plate..." );
    }
}
