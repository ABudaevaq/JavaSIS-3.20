package pro.it.sis.javacourse;

public class FlamingAsphalt implements Weapon {
    HitDamage hitDamage = HitDamage.FIREDAMAGE;
    @Override
    public void hit(Target target) {
        target.getDamage(hitDamage);
    }
}
