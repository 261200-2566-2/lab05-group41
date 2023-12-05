public class Main {

    public static void main(String[] args) {
        RPGCharacter player1 = new Mage();
        RPGCharacter player2 = new Tank();

        Sword sword = new Sword(50, 1);
        Shield shield = new Shield(100, 1);
        Accesory ringOfFire = new RingOfFire();

        player1.setname("MagePlayer");
        player1.equipSword(sword);
        player1.equipShield(shield);
        player1.equipAccessory(ringOfFire);

        player2.setname("TankPlayer");
        player2.equipShield(shield);

       
        player1.attack(player2);
        player2.defend(player1);
        player1.useAccessoryAbility(player2);

      
        player1.display();
        player2.display();
    }
}
