package pro.it.sis.javacourse;

public class Ifrit extends Target implements Damage {
    @Override
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.ICEDAMAGE) {
            return Damage.getPhysicalDamage() + Damage.getIceDamage();
        }
        return Damage.getPhysicalDamage();
    }
}
