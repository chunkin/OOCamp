import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class MeterTest {
    @Test
public void testMeterEquals() {
        Meter m1 = new Meter(1);
        Meter another_m1 = new Meter(1);
        Meter m2 = new Meter(2);
        assertEquals(m1,another_m1);
        assertFalse(m1.equals(m2));


    }

    @Test
    public void test_1m_add_1m_eq_2m() throws Exception {
        Meter m1 = new Meter(1);
        Meter m2 = new Meter(2);
        assertEquals(m2,m1.add(m1));

    }

    @Test
    public void test_1m_add_dot2m_eq_1dot2m() throws Exception {
        Meter m1 = new Meter(1);
        Meter dot2m = new Meter(0.2);
        assertEquals(new Meter(1.2),m1.add(dot2m));

    }

    @Test
    public void test_1m_add_1dm_eq_1dot1m() throws Exception {
        Meter m1 = new Meter(1);
        Decimeter d1 = new Decimeter(1);
        assertEquals(new Meter(1.1),m1.add(d1));
    }

    @Test
    public void test_1dm_add_2dm_eq_3dm() throws Exception {
        Decimeter d1 = new Decimeter(1);
        Decimeter d2 = new Decimeter(2);
        assertEquals(new Decimeter(3),d1.add(d2));

    }

    @Test
    public void test_1dm_add_2m_eq_2dot1m() throws Exception {
        Decimeter d1 = new Decimeter(1);
        Meter m2 = new Meter(2);
        assertEquals(new Meter(2.1),d1.add(m2));
    }
}
