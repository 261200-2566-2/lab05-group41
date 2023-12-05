//สร้าง accesory ที่จะนำไปใส่ให้ตัวละคร
public class AmuletOfStrength implements Accesory {
    private String name;

    public AmuletOfStrength() {
        this.name = "Amulet of Strength";
        
    }

    public String getName() {
        return name;
    }

    public void useAbility(RPGCharacter target) {
        System.out.println("Using " + name + "'s ability on " + target.getName());
    //เมื่อใช้ accesory จะมี sout เป็นตามนี้
    }

}

