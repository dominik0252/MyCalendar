package tests;

import model.Date;
import model.Entry;
import model.Time;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class EntryTest {
    Date date;
    Time time;
    String label;
    Entry testEntry;

    @Test
    public void testGetters() {
        assertEquals(testEntry.getDate(), date);
        assertEquals(testEntry.getTime(), time);
        assertEquals(testEntry.getLabel(), label);
    }

    @Test
    public void testSetRepetition() {
        setRepetitionInit();
        testEntry.setIntervalOfRepetition("7d");
        assertEquals(testEntry.getIntervalOfRepetition(), "7d");
        assertEquals(testEntry.getIsRepeating(), true);
    }

    @Test
    public void testRemoveRepetition() {
        setRepetitionInit();
        testEntry.setIntervalOfRepetition(null);
        assertEquals(testEntry.getIntervalOfRepetition(), null);
        assertEquals(testEntry.getIsRepeating(), false);
    }

    private void setRepetitionInit() {
        assertEquals(testEntry.getIntervalOfRepetition(), null);
        assertEquals(testEntry.getIsRepeating(), false);
        testEntry.setIntervalOfRepetition("30min");
        assertEquals(testEntry.getIntervalOfRepetition(), "30min");
        assertEquals(testEntry.getIsRepeating(), true);
    }

}
