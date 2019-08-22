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

    public void setIntervalOfRepetition(String intervalOfRepetition) {
        this.intervalOfRepetition = intervalOfRepetition;
        this.isRepeating = (intervalOfRepetition != null);
    }
}
