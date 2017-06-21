package org.nomadblacky.hamburger.hamburger;

/**
 * Created by blacky on 17/06/20.
 */
public enum MeetType {
    SAUSAGE("ソーセージ"),
    BACON("ベーコン"),
    ;

    private final String name;

    MeetType(String name) {
        this.name = name;
    }

    public String meetName() {
        return name;
    }
}
