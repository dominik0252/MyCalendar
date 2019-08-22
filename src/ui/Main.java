package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Calendar c = new Calendar(new Date(22, 8, 2019), "dominik@example.com");

        Event e1 = new Event(new Date(26, 8, 2019), new Time(8,0), "Check point");
        Event e2 = new Event(new Date(27, 8, 2019), new Time(10,0), "Trip to Croatia");
        Event e3 = new Event(new Date(28, 8, 2019), new Time(10, 0), "Visit PBZ for mToken");
        Meeting m1 = new Meeting(new Date(30, 8, 2019), new Time(15, 0), "Flat Payment");
        m1.addAttendee("dominik@example.com");
        m1.addAttendee("gazda@example.com");
        Event e4 = new Event(new Date(2,9,2019), new Time(7,0), "Trip to Pula");
        Meeting m2 = new Meeting(new Date(2,9,2019), new Time(11,0), "Introductory meeting");
        m2.addAttendee("dominik@example.com");
        m2.addAttendee("silvia@censosco.com");

        c.addEntry(e1);
        c.addEntry(e2);
        c.addEntry(e3);
        c.addEntry(e4);
        c.addEntry(m1);
        c.addEntry(m2);

        for (Entry entry : c.getEntries()) {
            System.out.println("On " + entry.getDate().inFormat("DD-MM-YYYY") + " at " + entry.getTime().inFormat("24") + ": " + entry.getLabel());
        }

        System.out.println();
        m1.sendInvitations();
        System.out.println();
        m2.sendInvitations();
    }
}
