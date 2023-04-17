package pro.it.sis.javacourse;

public class Target {
    protected int hp = 100;
    // Изобретаем велосипед
    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    private boolean immunity;

    private int physicalDamage;

    private int fireDamage;

    private int iceDamage;

}
