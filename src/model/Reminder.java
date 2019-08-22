package model;

public class Reminder extends Entry {
    String additionalNote;

    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
    }

    // getters

    public String getAdditionalNote() {
        return this.additionalNote;
    }

    // setters

    public void setAdditionalNote() {
        this.additionalNote = additionalNote;
    }

}
