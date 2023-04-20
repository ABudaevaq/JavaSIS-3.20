package pro.it.sis.javacourse;

public class Human extends Target implements Damage {
    @Override
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.PHYSICALDAMAGE) {
            return Damage.getPhysicalDamage();
        }
        if (hitDamage == HitDamage.FIREDAMAGE) {
            return Damage.getPhysicalDamage() + Damage.getFireDamage();
        }
        if (hitDamage == HitDamage.ICEDAMAGE) {
            return Damage.getPhysicalDamage() + Damage.getIceDamage();
        }
        return 0;
    }
}

