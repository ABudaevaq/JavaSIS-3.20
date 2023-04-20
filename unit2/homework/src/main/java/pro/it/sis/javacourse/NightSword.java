package pro.it.sis.javacourse;

public class NightSword implements Weapon {
    HitDamage hitDamage = HitDamage.ICEDAMAGE;
    @Override
    public void hit(Target target) {
        target.getDamage(hitDamage);
    }
}
