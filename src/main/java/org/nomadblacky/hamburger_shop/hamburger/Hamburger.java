package org.nomadblacky.hamburger_shop.hamburger;

import org.nomadblacky.hamburger_shop.topping.Topping;

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

    default String description() {
        return String.format(
                "「%s」バンズと「%s」からなる、「%s」ハンバーガーの値段は、%d円です。",
                bunsType().bunsName(), meetType().meetName(), name(), price()
                );
    }
}
