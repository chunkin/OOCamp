import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class MeterTest {
    @Test
public void testMeterEquals() {
        Length m1 = new Length(1, Length.meter);
        Length another_m1 = new Length(1, Length.meter);
        Length m2 = new Length(2, Length.meter);
        assertEquals(m1,another_m1);
        assertFalse(m1.equals(m2));


    }

    @Test
    public void test_1m_add_1m_eq_2m() throws Exception {
        Length m1 = new Length(1, Length.meter);
        Length m2 = new Length(2, Length.meter);
        assertEquals(m2,m1.add(m1));

    }

    @Test
    public void test_1m_add_dot2m_eq_1dot2m() throws Exception {
        Length m1 = new Length(1, Length.meter);
        Length dot2m = new Length(0.2, Length.meter);
        assertEquals(new Length(1.2, Length.meter),m1.add(dot2m));

    }

    @Test
    public void test_1m_add_1dm_eq_1dot1m() throws Exception {
        Length m1 = new Length(1, Length.meter);
        Length d1 = new Length(1, Length.decimeter);
        assertEquals(new Length(1.1, Length.meter),m1.add(d1));
    }

    @Test
    public void test_1dm_add_2dm_eq_3dm() throws Exception {
        Length d1 = new Length(1, Length.decimeter);
        Length d2 = new Length(2, Length.decimeter);
        assertEquals(new Length(3, Length.decimeter),d1.add(d2));

    }

    @Test
    public void test_1dm_add_2m_eq_2dot1m() throws Exception {
        Length d1 = new Length(1, Length.decimeter);
        Length m2 = new Length(2, Length.meter);
        assertEquals(new Length(2.1, Length.meter),d1.add(m2));
    }


}
