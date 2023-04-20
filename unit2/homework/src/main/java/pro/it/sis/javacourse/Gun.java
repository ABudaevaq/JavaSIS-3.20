package pro.it.sis.javacourse;

public class Gun implements Weapon {
    protected HitDamage hitDamage = HitDamage.PHYSICALDAMAGE;
    @Override
    public void hit(Target target) {
        target.getDamage(hitDamage);
    }
}
