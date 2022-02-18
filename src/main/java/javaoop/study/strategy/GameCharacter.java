package javaoop.study.strategy;

public class GameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("no weapon!");
        }else {
            weapon.attack();
        }
    }
}
