package model;

public abstract class Entry {
    Date date;
    Time time;
    String label;
    Boolean isRepeating;
    String intervalOfRepetition;

    public Entry(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }

    // getters

    public Date getDate() {
        return this.date;
    }

    public Time getTime() {
        return this.time;
    }

    public String getLabel() {
        return this.label;
    }

    public Boolean getIsRepeating() {
        return this.isRepeating;
    }

    public String getIntervalOfRepetition() {
        return this.intervalOfRepetition;
    }

    // setters

    // REQUIRES: intervalOfRepetition should be one of "30min", "1h", "2h", "3h", "6h", "12h", "1d", "7d"
    // EFFECTS:  Sets the intervalOfRepetition and isRepeating to true is interval is not null, otherwise false
    public void setIntervalOfRepetition(String intervalOfRepetition) {
        this.intervalOfRepetition = intervalOfRepetition;
        this.isRepeating = (intervalOfRepetition != null);
    }
}
