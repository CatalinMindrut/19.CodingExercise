package com.Catalin;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(100));
        System.out.println(getDaysInMonth(2, 2018));
    }
    public static boolean isLeapYear(int year){
        if(year <= 0 || year >9999){
            return false;
        } else return((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year){
        if(month <1 || month >12 || year <1 || year>9999){
            return -1;
        }
        int daysInMonth = 0;
        if (isLeapYear(year) && month == 2) {
            daysInMonth = 29;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
            }
        } return daysInMonth;
    }
}
