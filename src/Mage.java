//สร้าง class ขึ้นมาเมื่อผู้เล่นเลือก class ความสามารถจะปลี่ยนไปตามพลังนี้
public class Mage extends RPGCharacter {

    public Mage() {
        this.name = "Mage";
        this.level = 1;
        this.max_hp = 80;
        this.hp = max_hp;
        this.max_mana = 150;
        this.mana = max_mana;
        this.basespeed = 12;
        this.speed = basespeed;
    }
    public void performSpecialMageAbility(RPGCharacter target) {
        System.out.println("Mage performs a special ability!");
        
    }

}