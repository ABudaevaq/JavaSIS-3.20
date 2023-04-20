package pro.it.sis.javacourse;


public class Target implements Damage {
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.ICEDAMAGE) {
            return 0;
        } else {
            if (hitDamage == HitDamage.FIREDAMAGE) {
                return 0;
            }
        }
        return 0;
    }
}
