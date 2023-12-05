//สร้าง class ขึ้นมาเมื่อผู้เล่นเลือก class ความสามารถจะปลี่ยนไปตามพลังนี้
public class Tank extends RPGCharacter {
    public Tank() {
        this.name = "Tank";
        this.level = 1;
        this.max_hp = 200;
        this.hp = max_hp;
        this.max_mana = 50;
        this.mana = max_mana;
        this.basespeed = 8;
        this.speed = basespeed;
    }

    public void performSpecialTankAbility(RPGCharacter target) {
        System.out.println("Tank performs a special ability!");
    
    }
}
