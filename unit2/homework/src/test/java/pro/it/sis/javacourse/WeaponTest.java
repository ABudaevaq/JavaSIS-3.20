package pro.it.sis.javacourse;

import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void testPhysicalDamage() {

        Target t = new Target();
        Weapon w = new Weapon();
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
    }

    @Test
    public void testFireDamage() {

        Target t = new Target();
        FlamingAsphalt w = new FlamingAsphalt();
        w.hit(t);

        assertEquals(50, t.getFireDamage());
    }

    @Test
    public void testIceDamage() {

        Target t = new Target();
        NightSword w = new NightSword();
        w.hit(t);

        assertEquals(50, t.getIceDamage());
    }
}