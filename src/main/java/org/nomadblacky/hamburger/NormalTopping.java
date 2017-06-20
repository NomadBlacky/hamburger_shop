package org.nomadblacky.hamburger;

/**
 * Created by blacky on 17/06/20.
 */
public class NormalTopping extends AbstractTopping {

    public NormalTopping(String name, int price) {
        super(name, price);
    }

    @Override
    public String description() {
        return String.format("名称 : %s 値段 : %d円", name(), price());
    }
}
