package tests;

import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeTest {
    Time t1;
    Time t2;
    Time t3;
    Time t4;
    Time t5;
    Time t6;

    @Before
    public void setup() {
        t1 = new Time(5, 8);
        t2 = new Time(1, 46);
        t3 = new Time(15, 3);
        t4 = new Time(23, 59);
        t5 = new Time(0, 0);
        t6 = new Time(12, 34);
    }

    @Test
    public void testMakeTime() {
        assertEquals(t1.getHours(), 5);
        assertEquals(t1.getMinutes(), 8);
        assertEquals(t2.getHours(), 1);
        assertEquals(t2.getMinutes(), 46);
    }

    @Test
    public void testGetHoursAMPM() {
        assertEquals(t1.getHours("AM/PM"), "5");
        assertEquals(t2.getHours("AM/PM"), "1");
        assertEquals(t3.getHours("AM/PM"), "3");
        assertEquals(t4.getHours("AM/PM"), "11");
        assertEquals(t5.getHours("AM/PM"), "12");
        assertEquals(t6.getHours("AM/PM"), "12");
    }

    @Test
    public void testGetHours24() {
        assertEquals(t1.getHours("24"), "05");
        assertEquals(t2.getHours("24"), "01");
        assertEquals(t3.getHours("24"), "15");
        assertEquals(t4.getHours("24"), "23");
        assertEquals(t5.getHours("24"), "00");
        assertEquals(t6.getHours("24"), "12");
    }

    @Test
    public void testGetMinutesMI() {
        assertEquals(t1.getMinutes("MI"), "08");
        assertEquals(t2.getMinutes("MI"), "46");
        assertEquals(t3.getMinutes("MI"), "03");
        assertEquals(t4.getMinutes("MI"), "59");
        assertEquals(t5.getMinutes("MI"), "00");
    }

    @Test
    public void testInFormatAMPM() {
        assertEquals(t1.inFormat("AM/PM"), "5:08 AM");
        assertEquals(t2.inFormat("AM/PM"), "1:46 AM");
        assertEquals(t3.inFormat("AM/PM"), "3:03 PM");
        assertEquals(t4.inFormat("AM/PM"), "11:59 PM");
        assertEquals(t5.inFormat("AM/PM"), "12:00 AM");
        assertEquals(t6.inFormat("AM/PM"), "12:34 PM");
    }

    @Test
    public void testInFormat24() {
        assertEquals(t1.inFormat("24"), "05:08");
        assertEquals(t2.inFormat("24"), "01:46");
        assertEquals(t3.inFormat("24"), "15:03");
        assertEquals(t4.inFormat("24"), "23:59");
        assertEquals(t5.inFormat("24"), "00:00");
        assertEquals(t6.inFormat("24"), "12:34");
    }
}
