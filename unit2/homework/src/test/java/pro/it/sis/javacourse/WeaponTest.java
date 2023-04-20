package pro.it.sis.javacourse;

import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void testPhysicalDamage() {

        Target t = new Human();
        Gun w = new Gun();
        w.hit(t);

        assertEquals(100, t.getDamage(w.hitDamage));
    }

    @Test
    public void testFireDamage() {

        Target t = new Human();
        FlamingAsphalt w = new FlamingAsphalt();
        w.hit(t);

        assertEquals(150, t.getDamage(w.hitDamage));
    }

    @Test
    public void testIceDamage() {

        Target t = new Human();
        NightSword w = new NightSword();
        w.hit(t);

        assertEquals(150, t.getDamage(w.hitDamage));
    }
}