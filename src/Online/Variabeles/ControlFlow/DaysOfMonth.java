package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        int n;
        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        year = s.nextInt();
        System.out.println("Enter which month of the year it is");
        n = s.nextInt();
        if (isLeapYear(year, n) != -1) {
            System.out.println("The number of days in the month is: " + isLeapYear(year, n));
        } else {
            System.out.println("The input you entered is invalid");
        }
    }

    public static int isLeapYear(int year, int n) {
        boolean isLeap = false;
        if (year <= 0 && year < 99999) {
            return -1;
        } else {
            if (year % 4 == 0) {
                isLeap = true;

            } else if (year % 400 == 0) {
                isLeap = true;

            } else if (year % 100 == 0 && year % 400 != 0) {
                isLeap = false;

            }
            return getNoOfDays(isLeap, n);
        }

    }

    public static int getNoOfDays(boolean isLeap, int n) {
        int days = 0;
        if (isLeap == true) {
            if (n >=1 && n <= 12) {
                switch (n) {
                    case 1:
                        days = 31;
                        break;
                    case 2:
                        days = 29;
                        break;
                    case 3:
                        days = 31;
                        break;
                    case 4:
                        days = 30;
                        break;
                    case 5:
                        days = 31;
                        break;
                    case 6:
                        days = 30;
                        break;
                    case 7:
                        days = 31;
                        break;
                    case 8:
                        days = 31;
                        break;
                    case 9:
                        days = 30;
                        break;
                    case 10:
                        days = 31;
                        break;
                    case 11:
                        days = 30;
                        break;
                    case 12:
                        days = 31;
                        break;


                }
            }else{
                return -1;
            }


            } else {
                if (n > 1 && n < 12) {
                    switch (n) {
                        case 1:
                            days = 31;
                            break;

                        case 2:
                            days = 28;
                            break;
                        case 3:
                            days = 31;
                            break;
                        case 4:
                            days = 30;
                            break;
                        case 5:
                            days = 31;
                            break;
                        case 6:
                            days = 30;
                            break;
                        case 7:
                            days = 31;
                            break;
                        case 8:
                            days = 31;
                            break;
                        case 9:
                            days = 30;
                            break;
                        case 10:
                            days = 31;
                            break;
                        case 11:
                            days = 30;
                            break;
                        case 12:
                            days = 31;
                            break;


                    }


                }
                else{
                    return -1;
                }

            }
            return days;

        }

}







