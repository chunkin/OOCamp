import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class MeterTest {
    @Test
public void testMeterEquals() {
        Length m1 = new Length(1, Unit.Meter);
        Length another_m1 = new Length(1, Unit.Meter);
        Length m2 = new Length(2, Unit.Meter);
        assertEquals(m1,another_m1);
        assertFalse(m1.equals(m2));


    }

    @Test
    public void test_1m_add_1m_eq_2m() throws Exception {
        Length m1 = new Length(1, Unit.Meter);
        Length m2 = new Length(2, Unit.Meter);
        assertEquals(m2,m1.add(m1));

    }

    @Test
    public void test_1m_add_dot2m_eq_1dot2m() throws Exception {
        Length m1 = new Length(1, Unit.Meter);
        Length dot2m = new Length(0.2, Unit.Meter);
        assertEquals(new Length(1.2, Unit.Meter),m1.add(dot2m));

    }

    @Test
    public void test_1m_add_1dm_eq_1dot1m() throws Exception {
        Length m1 = new Length(1, Unit.Meter);
        Length d1 = new Length(1, Unit.Decimeter);
        assertEquals(new Length(1.1, Unit.Meter),m1.add(d1));
    }

    @Test
    public void test_1dm_add_2dm_eq_3dm() throws Exception {
        Length d1 = new Length(1, Unit.Decimeter);
        Length d2 = new Length(2, Unit.Decimeter);
        assertEquals(new Length(3, Unit.Decimeter),d1.add(d2));

    }

    @Test
    public void test_1dm_add_2m_eq_2dot1m() throws Exception {
        Length d1 = new Length(1, Unit.Decimeter);
        Length m2 = new Length(2, Unit.Meter);
        assertEquals(new Length(2.1, Unit.Meter),d1.add(m2));
    }

    @Test
    public void test_1cm_add_2cm_eq_3cm() throws Exception {
        Length cm1 = new Length(1, Unit.Centimeter);
        Length cm2 = new Length(2, Unit.Centimeter);
        assertEquals(new Length(3,Unit.Centimeter),cm1.add(cm2));


    }

    @Test
    public void test_1cm_add_1dm_eq_11cm() throws Exception {
        Length cm1 = new Length(1, Unit.Centimeter);
        Length cm2 = new Length(1, Unit.Decimeter);
        assertEquals(new Length(11,Unit.Centimeter),cm1.add(cm2));
    }

    @Test
    public void test_1cm_add_1m_eq_101cm() throws Exception {
        Length cm1 = new Length(1, Unit.Centimeter);
        Length cm2 = new Length(1, Unit.Meter);
        assertEquals(new Length(101,Unit.Centimeter),cm1.add(cm2));
    }
}
