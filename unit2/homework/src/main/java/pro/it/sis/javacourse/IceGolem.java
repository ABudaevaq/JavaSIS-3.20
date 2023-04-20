package pro.it.sis.javacourse;

public class IceGolem extends Target implements Damage {
    @Override
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.FIREDAMAGE) {
            return Damage.getPhysicalDamage() + Damage.getFireDamage();
        }
        return Damage.getPhysicalDamage();
    }
}
