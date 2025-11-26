/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dateproject;

import java.time.LocalDate;

/**
 * @author b.villarini
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        if ((year > 1939) && (year < 2099) && (month > 0) && (month < 13) && (day > 0) && (day < 32)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Not correct date");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((year > 1939) && (year < 2099)) {
            this.year = year;
        } else {
            System.out.println("Not correct range");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month > 0) && (month < 13)) {
            this.month = month;
        } else {
            System.out.println("Not correct range");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if ((day > 0) && (day < 32)) {
            this.day = day;
        } else {
            System.out.println("Not correct range");
        }
    }

    public String getDate() {
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }

    public void addDays(int daysToAdd) {
        // from String to LocalDate (JavaAPI)
        LocalDate date = LocalDate.of(this.year, this.month, this.day);

        // add days
        LocalDate newDate = date.plusDays(daysToAdd);

        day = newDate.getDayOfMonth();
        month = newDate.getMonthValue();
        year = newDate.getYear();


    }

    public String toString() {
        String dateStr = String.format("%02d/%02d/%04d", day, month, year);
        return dateStr;
    }


}
