public class Main {
    public static void main(String[] args) {
        System.out.println("=== School System ===");
        studentComponent();
        teacherComponent();
    }

    public static void studentComponent() {
        int ID = 101;
        String name = "Dyrems";
        String major = "Information Technology";

        System.out.println("Student: " + name + " (ID: " + ID + ") - Major: " + major);
    }

    public static void teacherComponent() {
        int id = 501;
        String name = "Mr. Sixson";
        String department = "Computer Programming";

        System.out.println("Teacher: " + name + " (ID: " + id + ") - Dept: " + department);
    }
}