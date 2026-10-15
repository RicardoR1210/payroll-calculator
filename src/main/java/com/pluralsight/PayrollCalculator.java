package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");// ask for name
        String name = scanner.nextLine();

        System.out.println("Enter your Pay Rate: ");// ask for pay rate
        float payRate = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter your hours Worked: ");// ask for total hours worked
        float hoursWorked = scanner.nextFloat();
        scanner.nextLine();

        if  (hoursWorked > 40) { // if they have overtime
            float regularPay = payRate * 40; //
            float overtimeHours = hoursWorked - 40;
            float overtimePay = overtimeHours *(payRate * 1.5f);
            float grossPay = regularPay + overtimePay;// calculate the gross pay for overtime
            System.out.printf("%s earned a overtime gross pay of $%.2f",name,grossPay);// display name and gross pay

        } else { // no overtime
        float grossPay = payRate * hoursWorked;// calculate the gross pay
        System.out.printf("%s earned a gross pay of $%.2f",name,grossPay);// display name and gross pay
        }
    }
}
