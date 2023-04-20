package pro.it.sis.javacourse;


public class Target implements Damage {
    public int getDamage(Weapon.HitDamage hitDamage) {
        if (hitDamage == HitDamage.ICEDAMAGE) {
            return 0;
        }
        if (hitDamage == HitDamage.FIREDAMAGE) {
            return 0;
        }
        return 0;
    }

    static int getPhysicalDamage() {
        return physicalDamage;
    }

    static int getFireDamage() {
        return fireDamage;
    }

    static int getIceDamage() {
        return iceDamage;
    }
    private static final int physicalDamage = 100;
    private static final int fireDamage = 50;
    private static final int iceDamage = 50;
}
