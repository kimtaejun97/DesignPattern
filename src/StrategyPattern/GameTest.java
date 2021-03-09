package StrategyPattern;

public class GameTest {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.setWeapon(new Gun());

        gameCharacter.attack();


    }
}
