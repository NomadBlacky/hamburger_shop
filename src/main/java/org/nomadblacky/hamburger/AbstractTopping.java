package org.nomadblacky.hamburger;

/**
 * Created by blacky on 17/06/20.
 */
public class AbstractTopping implements Topping {

    private final String name;
    private final int price;

    protected AbstractTopping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

}
