package Packs;

import java.util.Scanner;

public class AttendaceandStudentLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ATTENDANCE AND SCHEDULE LOGS ENTRY ===");

        // Getting input from the user
        System.out.print("Enter User ID (Student/Teacher): ");
        String userID = scanner.nextLine();

        System.out.print("Enter Subject Code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Enter Timestamp (e.g., YYYY-MM-DD HH:MM): ");
        String timeStamp = scanner.nextLine();

        System.out.print("Enter Log Method (e.g., QR, RFID, GPS): ");
        String logMethod = scanner.nextLine();

        System.out.print("Enter Location (Room/Building): ");
        String location = scanner.nextLine();

        System.out.print("Enter Status (Present, Late, Absent): ");
        String status = scanner.nextLine();

        System.out.print("Enter Schedule Change Log (or 'None'): ");
        String scheduleChangeLog = scanner.nextLine();

        // Displaying the recorded log
        System.out.println("\n==========================================");
        System.out.println("         RECORDED ATTENDANCE LOG         ");
        System.out.println("==========================================");
        System.out.println("User ID             : " + userID);
        System.out.println("Subject Code        : " + subjectCode);
        System.out.println("Timestamp           : " + timeStamp);
        System.out.println("Log Method          : " + logMethod);
        System.out.println("Location            : " + location);
        System.out.println("Status              : " + status);
        System.out.println("Schedule Change Log : " + scheduleChangeLog);
    }
}