package pro.it.sis.javacourse;

interface Weapon {
    enum HitDamage {
        FIREDAMAGE,
        ICEDAMAGE,
        PHYSICALDAMAGE;
    }
    final HitDamage hitDamage = null;
    default void hit(Target target) {
        Target t = target;
    }
}
