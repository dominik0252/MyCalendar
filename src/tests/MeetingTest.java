package tests;

import model.Date;
import model.Meeting;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MeetingTest extends EntryTest {
    Meeting testMeeting;
    String attendee1;
    String attendee2;

    @Before
    public void setup() {
        date = new Date(2,9,2019);
        time = new Time(11,0);
        label = "Introduction to Cenosco";
        testEntry = new Meeting(date, time, label);
        testMeeting = new Meeting(date, time, label);
    }

    @Test
    public void testReminder() {
        Reminder reminder = new Reminder(new Date(1,9,2019), new Time(19,30),null);
        testMeeting.setReminder(reminder);
        assertEquals(testMeeting.getReminder().getDate().inFormat("DD-MM-YYYY"), "01-09-2019");
        assertEquals(testMeeting.getReminder().getTime().inFormat("24"), "19:30");
        reminder = new Reminder(new Date(31,8,2019), new Time(21,00),null);
        String note = "In two days you start at Cenosco...";
        testMeeting.setReminder(reminder);
        testMeeting.getReminder().setAdditionalNote(note);
        assertEquals(testMeeting.getReminder().getDate().inFormat("DD-MM-YYYY"), "31-08-2019");
        assertEquals(testMeeting.getReminder().getTime().inFormat("24"), "21:00");
        assertEquals(testMeeting.getReminder().getAdditionalNote(), note);
    }

    @Test
    public void testAddAttendee() {
        addFewAttendees();
    }

    @Test
    public void testRemoveAttendee() {
        addFewAttendees();
        testMeeting.removeAttendee(attendee1);
        assertEquals(testMeeting.getAttendees().size(), 1);
        assertFalse(testMeeting.getAttendees().contains(attendee1));
        testMeeting.removeAttendee(attendee2);
        assertEquals(testMeeting.getAttendees().size(), 0);
        assertFalse(testMeeting.getAttendees().contains(attendee2));
    }

    @Test
    public void testGetAttendees() {
        addFewAttendees();
        ArrayList<String> testAttendees = new ArrayList<>();
        testAttendees.add(attendee1);
        testAttendees.add(attendee2);
        assertEquals(testMeeting.getAttendees(), testAttendees);
    }

    private void addFewAttendees() {
        attendee1 = "dominik@example.com";
        attendee2 = "silvia@cenosco.com";
        assertEquals(testMeeting.getAttendees().size(), 0);
        testMeeting.addAttendee(attendee1);
        assertEquals(testMeeting.getAttendees().size(), 1);
        assertTrue(testMeeting.getAttendees().contains(attendee1));
        testMeeting.addAttendee(attendee2);
        assertEquals(testMeeting.getAttendees().size(), 2);
        assertTrue(testMeeting.getAttendees().contains(attendee2));
    }

}
