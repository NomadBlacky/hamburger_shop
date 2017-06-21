package org.nomadblacky.hamburger_shop;

import org.nomadblacky.hamburger_shop.hamburger.Hamburger;
import org.nomadblacky.hamburger_shop.topping.NormalTopping;
import org.nomadblacky.hamburger_shop.topping.Topping;

/**
 * Created by blacky on 17/06/20.
 */
public class Main {

    private Hamburger regular = new

    private Topping tomato  = new NormalTopping("トマト",  30);
    private Topping lettuce = new NormalTopping("レタス",  75);
    private Topping cheese  = new NormalTopping("チーズ", 100);
    private Topping egg     = new NormalTopping("タマゴ",  50);

    private void run() {

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
