/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dateproject;

import java.util.Scanner;

/**
 * @author b.villarini
 */
public class DateProject {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the day of your date");
        int day = s.nextInt();

        System.out.println("Please enter the month of your date");
        int month = s.nextInt();

        System.out.println("Please enter the year of your date");
        int year = s.nextInt();

        Date date = new Date(day, month, year);

        System.out.println("The date you enter is: " + date);
    }
}
