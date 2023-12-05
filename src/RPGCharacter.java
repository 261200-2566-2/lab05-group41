public class RPGCharacter {

    
    String name;
    int level;
    int max_hp;
    int max_mana;
    int basespeed;
    int hp;
    int mana;
    int speed;
    Sword equippedSword;
    Shield equippedShield;
    String job;
    private Accesory equippedAccessory;

    public String getName() {
        return name;
    }

    public RPGCharacter() {
        name = "You";
        level = 1;
        max_hp = 100;
        hp = max_hp;
        max_mana = 50;
        mana = max_mana;
        basespeed = 10;
        speed = 10;
    }

    public void setname(String name) {
        this.name = name;
    }
    
    //method นี้เอาไว้เลือก job
    public String applyJob(String job) {
        switch (job.toLowerCase()) {
            case "tank":
                return "Tank";
            case "mage":
                return "Mage";
            default:
                return "Unknown Job";
        }
    }
  
    //method นี้เอาไว้สวมใส่หรือถอดอุปกรณ์
     public void equipAccessory(Accesory accessory) {
        unequipAccessory();
        equippedAccessory = accessory;
        System.out.println("Equipped " + accessory.getName());
    }

    public void unequipAccessory() {
        if (equippedAccessory != null) {
            System.out.println("Unequipped " + equippedAccessory.getName());
            equippedAccessory = null;
        }
    }

    public void useAccessoryAbility(RPGCharacter target) {
        if (equippedAccessory != null) {
            equippedAccessory.useAbility(target);
        } else {
            System.out.println("No accessory equipped. Unable to use accessory ability.");
        }
    }

    public void levelup() {
        level++;
        max_hp = hp + 10 * (level - 1);
        max_mana = mana + 1 * (level - 1);
        speed = speed + 5 * (level - 1);
    }

    public void equipSword(Sword sword) {
        unequipSword();
        equippedSword = sword;
        speed = speed - 5;
        System.out.println("You have Sword");
    }

    public void unequipSword() {
        if (equippedSword != null) {
            equippedSword = null;
        }
        speed = speed + 5;
    }

    public void equipShield(Shield shield) {
        unequipShield();
        equippedShield = shield;
        System.out.println("You have Shield");
    }

    public void unequipShield() {
        if (equippedShield != null) {
            equippedShield = null;
        }
    }

    private int calculator_attack() {
        if (equippedSword != null) {
            return equippedSword.fight();
        } else {
            return 0;
        }
    }

    public void attack(RPGCharacter enemy) {
        int damage = calculator_attack();
        int defended = enemy.calculator_defend();

        int totalDamage = Math.max(0, damage - defended);

        enemy.receiveDamage(totalDamage);

        System.out.println(name + " attacks for " + totalDamage + " damage");
    }

    public void defend(RPGCharacter enemy) {
        int defended = calculator_defend();
        int damage = enemy.calculator_attack() - defended;

        hp -= damage;

        System.out.println(name + " defends and takes " + damage + " damage");
    }

    public int calculator_defend() {
        if (equippedShield == null) {
            return 0;
        } else {
            return equippedShield.getdefend();
        }
    }

    public void receiveDamage(int damage) {
        hp -= damage;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("HP: " + max_hp);
        System.out.println("Mana: " + max_mana);
        System.out.println("Speed: " + speed);
        System.out.println("Equipped Sword: " + equippedSword);
        System.out.println("Equipped Shield: " + equippedShield);
        
        if (equippedAccessory != null) {
            System.out.println("Equipped Accessory: " + equippedAccessory.getName());
        }


        
        System.out.println(".........................");
    }




    
}