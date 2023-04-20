package pro.it.sis.javacourse;

public class Gun implements Weapon {
    HitDamage hitDamage = HitDamage.PHYSICALDAMAGE;
    @Override
    public void hit(Target target) {
        Target t = target;
        t.getDamage(hitDamage);
    }
}
