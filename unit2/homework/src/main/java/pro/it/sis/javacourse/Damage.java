package pro.it.sis.javacourse;

interface Damage extends Weapon {
    default int getDamage(Weapon.HitDamage hitDamage) {
        return 0;
    }
}
