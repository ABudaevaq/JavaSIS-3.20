package pro.it.sis.javacourse;

public class Human extends Target implements Damage {
    @Override
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.PHYSICALDAMAGE) {
            return Target.getPhysicalDamage();
        }
        if (hitDamage == HitDamage.FIREDAMAGE) {
            return Target.getPhysicalDamage() + Target.getFireDamage();
        }
        if (hitDamage == HitDamage.ICEDAMAGE) {
            return Target.getPhysicalDamage() + Target.getIceDamage();
        }
        return 0;
    }
}

