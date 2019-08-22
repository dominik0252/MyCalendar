package model;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getters

    public int getDay() {
        return this.day;
    }

    // REQUIRES: format must be "DD"
    // EFFECTS:  returns day in format "DD" (08 for 8th or 18 for 18th)
    public String getDay(String format) {
        if (format == "DD") {
            String dayAsString = String.valueOf(day);
            if (day < 10) {
                return "0" + dayAsString;
            } else {
                return dayAsString;
            }
        }

        return null;
    }

    public int getMonth() {
        return this.month;
    }

    // REQUIRES: format must be "MM" or "Month"
    // EFFECTS:  returns month in format "MM" (08 for August or 12 for December) or "Month" ("January", "May", ...)
    public String getMonth(String format) {
        if (format == "MM") {
            String monthAsString = String.valueOf(month);
            if (month < 10) {
                return "0" + monthAsString;
            } else {
                return monthAsString;
            }
        } else if (format == "Month") {
            switch(month) {
                case 1: return "January";
                case 2: return "February";
                case 3: return "March";
                case 4: return "April";
                case 5: return "May";
                case 6: return "June";
                case 7: return "July";
                case 8: return "August";
                case 9: return "September";
                case 10: return "October";
                case 11: return "November";
                case 12: return "December";
            }
        }

        return null;
    }

    public int getYear() {
        return this.year;
    }

    // REQUIRES: format must be "YYYY"
    // EFFECTS:  returns year as string in format "YYYY"
    public String getYear(String format) {
        if (format == "YYYY") {
            return String.valueOf(this.year);
        }

        return null;
    }

    // REQUIRES: format must be one of "DD-MM-YYYY", "DD/MM/YYYY", "YYYY-MM-DD", "MM/DD/YYYY", "Month DD, YYYY"
    // EFFECTS:  returns date in a given format
    public String inFormat(String format) {
        switch (format) {
            case "DD-MM-YYYY": return getDay("DD") + "-" + getMonth("MM") + "-" + getYear("YYYY");
            case "DD/MM/YYYY": return getDay("DD") + "/" + getMonth("MM") + "/" + getYear("YYYY");
            case "YYYY-MM-DD": return getYear("YYYY") + "-" + getMonth("MM") + "-" + getDay("DD");
            case "MM/DD/YYYY": return getMonth("MM") + "/" + getDay("DD") + "/" + getYear("YYYY");
            case "Month DD, YYYY":
                return getMonth("Month") + " " + getDay("DD") + ", " + getYear("YYYY");
        }

        return null;
    }
}
