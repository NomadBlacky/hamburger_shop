package org.nomadblacky.hamburger;

import java.util.List;

/**
 * Created by blacky on 17/06/20.
 */
public interface Hamburger {
    String name();
    MeetType meetType();
    BunsType bunsType();
    int price();
    List<Topping> toppings();
}
