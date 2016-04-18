/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Calendar;

/**
 *
 * @author MZ
 */
public class Data {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    Calendar cal = Calendar.getInstance();

    public int getDay() {
        return cal.get(Calendar.DATE);
    }

    public int getMonth() {
        return cal.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        return cal.get(Calendar.YEAR);
    }

    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return cal.get(Calendar.SECOND);
    }

    public String formaData() {
        String s = "";
        s = s + getHour() + ":" + getMinute() + ":" + getSecond() + " " + getDay() + "-" + getMonth() + "-" + getYear() + "\n";
        return s;
    }

    public String stampaData() {
        String s = "";
        s = s + String.format("%-20s", formaData());
        return s;
    }
}

class TestData {

    public static void main(String[] args) {

        Data x = new Data();

        System.out.println(x.stampaData());

    }
}
