package model;

public class Event extends Entry {
    Reminder reminder;

    public Event(Date date, Time time) {
        super(date, time);
    }

    // getters

    public Reminder getReminder() {
        return this.reminder;
    }

    // setters

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

}
