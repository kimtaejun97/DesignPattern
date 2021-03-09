package StrategyPattern;

public class GameCharacter {
    Weapon weapon = null;
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if (weapon ==null)
            System.out.println("Hand Attack");
        else{
            weapon.attack();
        }
    }
}
