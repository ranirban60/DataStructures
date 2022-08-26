/*
 program Calendar.java that takes the month and year as command-line
arguments and prints the Calendar of the month.
 */

package com.bridgelabz;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Calendar {
    String[][] calendar = new String[6][7];
    private String month;

    /**
     * Method for setting up the calendar layout
     */
    public void calendarLayout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month : ");
        month = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        System.out.println("\n % Java Calendar " + month + " " + year + "\n");
        String weekName = "S\t" + "M\t" + "T\t" + "W\t" + "Th\t" + "F\t" + "S\t";
        System.out.println(weekName);
    }

    /**
     * Method for printing the calendar
     */
    public void printCalendar() {
        Random r = new Random();
        int dayCount = 1;
        int numberOfDays;
        if (month.equals("January") || month.equals("March") || month.equals("May") ||
                month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")) {
            numberOfDays = 31;
        } else if (month.equals("February")) {
            numberOfDays = 28;
        } else numberOfDays = 30;
        int random = r.nextInt(7);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (dayCount <= numberOfDays) {
                    if (random-- > 0) {
                        calendar[i][j] = " ";
                    } else {
                        calendar[i][j] = Integer.toString(dayCount);
                        dayCount++;
                    }
                    System.out.print(calendar[i][j] + "\t");
                    if (j == 6) System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Calendar cal = new Calendar();
        cal.calendarLayout();//Method for setting up the calendar layout
        cal.printCalendar();//Method for printing the calendar
    }
}