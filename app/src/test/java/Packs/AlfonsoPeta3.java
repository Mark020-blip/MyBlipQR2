package Packs;

import java.util.Scanner;

public class AlfonsoPeta3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Attendance Check-in Data
        String studentID;
        String studentName;
        String date;
        String checkInTime;
        String attendanceStatus;

        // Input student information
        System.out.println("=== ATTENDANCE CHECK-IN SYSTEM ===");

        System.out.print("Enter Student ID: ");
        studentID = input.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = input.nextLine();

        System.out.print("Enter Date: ");
        date = input.nextLine();

        System.out.print("Enter Check-in Time: ");
        checkInTime = input.nextLine();

        System.out.print("Enter Attendance Status: ");
        attendanceStatus = input.nextLine();

        // Display attendance record
        System.out.println("\n=== ATTENDANCE RECORD ===");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Date: " + date);
        System.out.println("Check-in Time: " + checkInTime);
        System.out.println("Attendance Status: " + attendanceStatus);

        input.close();
    }
}