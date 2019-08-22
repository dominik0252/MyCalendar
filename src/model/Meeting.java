package model;

import java.util.ArrayList;

public class Meeting extends Event {
    ArrayList<String> attendees;

    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
        this.attendees = new ArrayList<>();
    }

    // getters

    public ArrayList<String> getAttendees() {
        return this.attendees;
    }

    // REQUIRES: Attendee email should be valid email address
    // MODIFIES: this
    // EFFECTS:  Adds an attendee email to the list of attendees
    public void addAttendee(String attendeeEmail) {
        attendees.add(attendeeEmail);
    }

    // REQUIRES: Attendee email should be valid email address
    // MODIFIES: this
    // EFFECTS:  Removes an attendee email from the list of attendees
    public void removeAttendee (String attendeeEmail) {
        attendees.remove(attendees.indexOf(attendeeEmail));
    }

    // EFFECTS:  Prints the list of attendees' emails prefixed by "Inviting "
    public void sendInvitations() {
        for (String attendee : attendees) {
            System.out.println("Inviting: " + attendee + " to " + this.label + "...");
        }
    }
}
