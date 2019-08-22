package model;

import java.util.ArrayList;

public class Calendar {
    Date currentDate;
    String email;
    ArrayList<Entry> entries;

    public Calendar(Date date, String email) {
        this.currentDate = date;
        this.email = email;
        this.entries = new ArrayList<>();
    }

    // getters

    public Date getCurrentDate() {
        return this.currentDate;
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    // MODIFIES: this
    // EFFECTS:  adds an entry to the calendar
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    // MODIFIES: this
    // EFFECTS:  removes an entry from the calendar
    public void removeEntry(Entry entry) {
        entries.remove(entries.indexOf(entry));
    }
}
