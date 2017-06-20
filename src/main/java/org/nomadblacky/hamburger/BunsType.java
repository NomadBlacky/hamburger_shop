package org.nomadblacky.hamburger;

/**
 * Created by blacky on 17/06/20.
 */
public enum BunsType {
    REGULAR("レギュラー"),
    HEALTHY("ヘルシー"),
    DELUX("バンズ&クラブ"),
    ;

    private final String name;

    BunsType(String name) {
        this.name = name;
    }

    public String bunsName() {
        return name;
    }
}
