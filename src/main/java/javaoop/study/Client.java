package javaoop.study;

import javaoop.study.strategy.*;

public class Client {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        Weapon gun = new Gun();

        character.setWeapon(gun);
        character.attack();
    }
}
