package model;

import java.util.ArrayList;

public class Meeting extends Event {
    ArrayList<String> attendees;

    public Meeting(Date date, Time time) {
        super(date, time);
    }

    // getters

    public ArrayList<String> getAttendees() {
        return this.attendees;
    }

    // REQUIRES: Attendee email should be valid email address
    // EFFECTS:  Adds an attendee email to the list of attendees
    public void addAttendee(String attendeeEmail) {
        attendees.add(attendeeEmail);
    }

    // REQUIRES: Attendee email should be valid email address
    // EFFECTS:  Removes an attendee email from the list of attendees
    public void removeAttendee (String attendeeEmail) {
        attendees.remove(attendees.indexOf(attendeeEmail));
    }

    public void sendInvitations() {
        for (String attendee : attendees) {
            System.out.println("Inviting: " + attendee);
        }
    }
}
