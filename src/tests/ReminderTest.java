package tests;

import model.Date;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReminderTest extends EntryTest {
    Reminder testReminder;

    @Before
    public void setup() {
        date = new Date(1,9,2019);
        time = new Time(9,30);
        label = "Pay rent";
        testEntry = new Reminder(date, time, label);
        testReminder = new Reminder(date, time, label);
    }

    @Test
    public void testAdditionalNote() {
        String note = "This is test note";
        checkAdditionalNote(note);
        note = "Updated test note";
        checkAdditionalNote(note);
    }

    private void checkAdditionalNote(String note) {
        testReminder.setAdditionalNote(note);
        assertEquals(testReminder.getAdditionalNote(), note);
    }
}
