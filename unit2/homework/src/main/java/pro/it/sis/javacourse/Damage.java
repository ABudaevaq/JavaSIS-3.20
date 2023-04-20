package pro.it.sis.javacourse;

interface Damage extends Weapon {
    default int getDamage(Weapon.HitDamage hitDamage) {
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

    static final int physicalDamage = 100;
    static final int fireDamage = 50;
    static final int iceDamage = 50;
}
