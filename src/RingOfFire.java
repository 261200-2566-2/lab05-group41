//สร้าง accesory ที่จะนำไปใส่ให้ตัวละคร
public class RingOfFire implements Accesory {

    private String name;

    public RingOfFire() {
        this.name = "Ring of Fire";
    }

    public String getName() {
        return name;
    }
    public void useAbility(RPGCharacter target) {
        System.out.println("Using " + name + "'s ability on " + target.getName());
        //เมื่อใช้ accesory จะมี sout เป็นตามนี้
    }
}
