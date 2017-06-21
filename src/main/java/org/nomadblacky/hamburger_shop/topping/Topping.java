package org.nomadblacky.hamburger_shop.topping;

/**
 * Created by blacky on 17/06/20.
 */
public interface Topping {
    String name();
    int price();
    default String description() {
        return String.format("名称 : %s 値段 : %d円", name(), price());
    }
}
