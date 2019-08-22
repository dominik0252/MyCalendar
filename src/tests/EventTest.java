package tests;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EventTest extends EntryTest {
    Event testEvent;

    @Before
    public void setup() {
        date = new Date(18,8,2020);
        time = new Time(18,2);
        label = "Mia three years!";
        testEntry = new Event(date, time, label);
        testEvent = new Event(date, time, label);
    }

    @Test
    public void testReminder() {
        Reminder reminder = new Reminder(new Date(17,8,2020), new Time(20,0),null);
        testEvent.setReminder(reminder);
        assertEquals(testEvent.getReminder().getDate().inFormat("DD-MM-YYYY"), "17-08-2020");
        assertEquals(testEvent.getReminder().getTime().inFormat("24"), "20:00");
        reminder = new Reminder(new Date(1,1,2020), new Time(10,30),null);
        String note = "Mia has three years this year in August!";
        testEvent.setReminder(reminder);
        testEvent.getReminder().setAdditionalNote(note);
        assertEquals(testEvent.getReminder().getDate().inFormat("DD-MM-YYYY"), "01-01-2020");
        assertEquals(testEvent.getReminder().getTime().inFormat("24"), "10:30");
        assertEquals(testEvent.getReminder().getAdditionalNote(), note);
    }
}
