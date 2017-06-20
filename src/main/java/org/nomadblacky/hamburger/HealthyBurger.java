package org.nomadblacky.hamburger;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by blacky on 17/06/20.
 */
public class HealthyBurger implements Hamburger {

    private final String name;
    private final MeetType meetType;
    private final int price;
    private final List<Topping> toppings;

    public HealthyBurger(String name, MeetType meetType, int price, List<? extends Topping> toppings) {
        this.name = name;
        this.meetType = meetType;
        this.price = price;
        this.toppings = Collections.unmodifiableList(toppings);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public MeetType meetType() {
        return meetType;
    }

    @Override
    public BunsType bunsType() {
        return BunsType.HEALTHY;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public List<Topping> toppings() {
        return toppings;
    }
}
