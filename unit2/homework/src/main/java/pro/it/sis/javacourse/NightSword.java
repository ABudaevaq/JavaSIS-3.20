package pro.it.sis.javacourse;

public class NightSword implements Weapon {
    protected HitDamage hitDamage = HitDamage.ICEDAMAGE;
    @Override
    public void hit(Target target) {
        target.getDamage(hitDamage);
    }
}
