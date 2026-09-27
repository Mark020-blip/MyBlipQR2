package Otto;

import java.util.Scanner;

public class Ching {

    public static void main(String[] args) {
        // Call the room change method
        RoomChangeComponent();
    }

    public static void RoomChangeComponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ROOM CHANGE COMPONENT ===");

        // Stores the room or lab name (e.g., "Lab 302")
        System.out.print("Enter New Room Number: ");
        String newRoomNumber = scanner.nextLine();

        // Shows the building of the new room.
        System.out.print("Enter Building Name: ");
        String buildingName = scanner.nextLine();

        // Keeps the updated schedule for the new class start time.
        System.out.print("Enter New Start Time: ");
        int newStartTime = scanner.nextInt();

        // Displaying the recorded room change
        System.out.println("\n==========================================");
        System.out.println("          RECORDED ROOM CHANGE           ");
        System.out.println("==========================================");
        System.out.println("Building Name       : " + buildingName);
        System.out.println("New Room Number     : " + newRoomNumber);
        System.out.println("New Start Time      : " + newStartTime);
        System.out.println("==========================================");

        scanner.close();
    }
}

