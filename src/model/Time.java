package model;

public class Time {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // getters

    public int getHours() {
        return this.hours;
    }

    // REQUIRES: format must be one of "AM/PM" or "24"
    // EFFECTS:  returns hours in the given format
    public String getHours(String format) {
        if (format == "AM/PM") {
            if (this.hours == 0 || this.hours == 12) {
                return "12";
            } else {
                return String.valueOf(this.hours % 12);
            }
        } else if (format == "24") {
            String hoursAsString = String.valueOf(this.hours);
            if (this.hours < 10) {
                return "0" + hoursAsString;
            } else {
                return hoursAsString;
            }
        }

        return null;
    }

    public int getMinutes() {
        return this.minutes;
    }

    // REQUIRES: format must be "MI"
    // EFFECTS:  returns minutes in format "MI" ("07" for 7, "45" for 45)
    public String getMinutes(String format) {
        if (format == "MI") {
            String minutesAsString = String.valueOf(this.minutes);
            if (this.minutes < 10) {
                return "0" + minutesAsString;
            } else {
                return minutesAsString;
            }
        }

        return null;
    }

    // REQUIRES: format must "AM/PM" or "24"
    // EFFECTS:  returns time in the given format
    public String inFormat (String format) {
        if (format == "AM/PM") {
            String timeOfDay;
            if (this.hours < 12) {
                timeOfDay = "AM";
            } else {
                timeOfDay = "PM";
            }

            return getHours("AM/PM") + ":" + getMinutes("MI") + " " + timeOfDay;

        } else if (format == "24") {
            return getHours("24") + ":" + getMinutes("MI");
        }

        return null;
    }
}
