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
    public void testMeterAdd() throws Exception {
        Meter m1 = new Meter(1);
        Meter another_m1 = new Meter(1);
        Meter m2 = new Meter(2);
        Meter mdot2 = new Meter(0.2);
        assertEquals(m1.add(another_m1),m2);
        assertEquals(m1.add(mdot2),new Meter(1.2));
        assertEquals(mdot2.add(mdot2),new Meter(0.4));

    }
}
