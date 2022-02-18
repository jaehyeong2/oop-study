package javaoop.study.strategy;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("gun!");
    }
}
