package tests;

import model.Date;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {
    Date d1;
    Date d2;
    Date d3;
    Date d4;

    @Before
    public void setup() {
        d1 = new Date(22, 8, 2019);
        d2 = new Date(1, 5, 2018);
        d3 = new Date(5, 10, 1995);
        d4 = new Date(21, 12, 1652);
    }

    @Test
    public void testMakeDate() {
        assertEquals(d1.getDay(), 22);
        assertEquals(d1.getMonth(), 8);
        assertEquals(d1.getYear(), 2019);
        assertEquals(d2.getDay(), 1);
        assertEquals(d2.getMonth(), 5);
        assertEquals(d2.getYear(), 2018);
    }

    @Test
    public void testGetDayDD() {
        String dayDD1 = d1.getDay("DD");
        assertEquals(dayDD1, "22");
        String dayDD2 = d2.getDay("DD");
        assertEquals(dayDD2, "01");
        String dayDD3 = d3.getDay("DD");
        assertEquals(dayDD3, "05");
        String dayDD4 = d4.getDay("DD");
        assertEquals(dayDD4, "21");
    }

    @Test
    public void testGetMonthMM() {
        String monthMM1 = d1.getMonth("MM");
        assertEquals(monthMM1, "08");
        String monthMM2 = d2.getMonth("MM");
        assertEquals(monthMM2, "05");
        String monthMM3 = d3.getMonth("MM");
        assertEquals(monthMM3, "10");
        String monthMM4 = d4.getMonth("MM");
        assertEquals(monthMM4, "12");
    }

    @Test
    public void testGetYearYYYY() {
        String yearYYYY1 = d1.getYear("YYYY");
        assertEquals(yearYYYY1, "2019");
        String yearYYYY2 = d2.getYear("YYYY");
        assertEquals(yearYYYY2, "2018");
        String yearYYYY3 = d3.getYear("YYYY");
        assertEquals(yearYYYY3, "1995");
        String yearYYYY4 = d4.getYear("YYYY");
        assertEquals(yearYYYY4, "1652");
    }

    @Test
    public void testGetMonthMonth() {
        String monthMonth1 = d1.getMonth("Month");
        assertEquals(monthMonth1, "August");
        String monthMonth2 = d2.getMonth("Month");
        assertEquals(monthMonth2, "May");
        String monthMonth3 = d3.getMonth("Month");
        assertEquals(monthMonth3, "October");
        String monthMonth4 = d4.getMonth("Month");
        assertEquals(monthMonth4, "December");
    }

    @Test
    public void testInFormatDDMMYYYY() {
        String formattedDate1 = d1.inFormat("DD-MM-YYYY");
        assertEquals(formattedDate1, "22-08-2019");
        String formattedDate2 = d2.inFormat("DD-MM-YYYY");
        assertEquals(formattedDate2, "01-05-2018");
        String formattedDate3 = d3.inFormat("DD-MM-YYYY");
        assertEquals(formattedDate3, "05-10-1995");
        String formattedDate4 = d4.inFormat("DD-MM-YYYY");
        assertEquals(formattedDate4, "21-12-1652");
    }

    @Test
    public void testInFormatDDMMYYYY2() {
        String formattedDate1 = d1.inFormat("DD/MM/YYYY");
        assertEquals(formattedDate1, "22/08/2019");
        String formattedDate2 = d2.inFormat("DD/MM/YYYY");
        assertEquals(formattedDate2, "01/05/2018");
        String formattedDate3 = d3.inFormat("DD/MM/YYYY");
        assertEquals(formattedDate3, "05/10/1995");
        String formattedDate4 = d4.inFormat("DD/MM/YYYY");
        assertEquals(formattedDate4, "21/12/1652");
    }

    @Test
    public void testInFormatYYYYMMDD() {
        String formattedDate1 = d1.inFormat("YYYY-MM-DD");
        assertEquals(formattedDate1, "2019-08-22");
        String formattedDate2 = d2.inFormat("YYYY-MM-DD");
        assertEquals(formattedDate2, "2018-05-01");
        String formattedDate3 = d3.inFormat("YYYY-MM-DD");
        assertEquals(formattedDate3, "1995-10-05");
        String formattedDate4 = d4.inFormat("YYYY-MM-DD");
        assertEquals(formattedDate4, "1652-12-21");
    }

    @Test
    public void testInFormatMMDDYYYY() {
        String formattedDate1 = d1.inFormat("MM/DD/YYYY");
        assertEquals(formattedDate1, "08/22/2019");
        String formattedDate2 = d2.inFormat("MM/DD/YYYY");
        assertEquals(formattedDate2, "05/01/2018");
        String formattedDate3 = d3.inFormat("MM/DD/YYYY");
        assertEquals(formattedDate3, "10/05/1995");
        String formattedDate4 = d4.inFormat("MM/DD/YYYY");
        assertEquals(formattedDate4, "12/21/1652");
    }

    @Test
    public void testInFormatMonthDDYYYY() {
        String formattedDate1 = d1.inFormat("Month DD, YYYY");
        assertEquals(formattedDate1, "August 22, 2019");
        String formattedDate2 = d2.inFormat("Month DD, YYYY");
        assertEquals(formattedDate2, "May 01, 2018");
        String formattedDate3 = d3.inFormat("Month DD, YYYY");
        assertEquals(formattedDate3, "October 05, 1995");
        String formattedDate4 = d4.inFormat("Month DD, YYYY");
        assertEquals(formattedDate4, "December 21, 1652");
    }

}
