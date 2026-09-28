package Practicalexam;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an individual Course in the schedule.
 */
class Course {
    private String courseCode;
    private String courseName;
    private String dayOfWeek; // e.g., "Monday", "MWF", "TTh"
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;

    public Course(String courseCode, String courseName, String dayOfWeek, LocalTime startTime, LocalTime endTime, String location) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public String getDayOfWeek() { return dayOfWeek; }
    public LocalTime getStartTime() { return startTime; }
    public LocalTime getEndTime() { return endTime; }
    public String getLocation() { return location; }

    /**
     * Checks if this course overlaps in time with another course on the same day.
     */
    public boolean conflictsWith(Course other) {
        if (this.dayOfWeek.equalsIgnoreCase(other.dayOfWeek)) {
            // Overlap condition: start1 < end2 AND start2 < end1
            return this.startTime.isBefore(other.endTime) && other.startTime.isBefore(this.endTime);
        }
        return false;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return String.format("[%s] %s | %s %s - %s | Location: %s",
                courseCode, courseName, dayOfWeek, startTime.format(formatter), endTime.format(formatter), location);
    }
}

/**
 * Manages the collection of courses and handles schedule operations.
 */
class ClassSchedule {
    private List<Course> schedule;

    public ClassSchedule() {
        this.schedule = new ArrayList<>();
    }

    /**
     * Adds a course if there are no time conflicts.
     */
    public boolean addCourse(Course newCourse) {
        for (Course course : schedule) {
            if (course.conflictsWith(newCourse)) {
                System.out.println("❌ CONFLICT ERROR: Cannot add " + newCourse.getCourseCode() +
                        ". Conflicts with " + course.getCourseCode() + " on " + course.getDayOfWeek());
                return false;
            }
        }
        schedule.add(newCourse);
        System.out.println("✅ Added course: " + newCourse.getCourseCode());
        return true;
    }

    /**
     * Displays all scheduled courses.
     */
    public void displaySchedule() {
        System.out.println("\n===== CURRENT CLASS SCHEDULE =====");
        if (schedule.isEmpty()) {
            System.out.println("No classes scheduled yet.");
            return;
        }
        for (Course course : schedule) {
            System.out.println(course);
        }
        System.out.println("==================================\n");
    }
}

/**
 * Main entry point matching Main.java filename.
 */
public class main {
    public static void main(String[] args) {
        ClassSchedule mySchedule = new ClassSchedule();

        // Sample Data: Define classes
        Course cs101 = new Course("CS101", "Intro to Computer Science", "Monday",
                LocalTime.of(9, 0), LocalTime.of(10, 30), "Room 301");

        Course math201 = new Course("MATH201", "Calculus I", "Monday",
                LocalTime.of(10, 45), LocalTime.of(12, 15), "Room 105");

        // Conflicting course with MATH201
        Course phys101 = new Course("PHYS101", "Physics I", "Monday",
                LocalTime.of(11, 0), LocalTime.of(12, 30), "Lab 2");

        Course eng102 = new Course("ENG102", "English Composition", "Tuesday",
                LocalTime.of(13, 0), LocalTime.of(14, 30), "Room 202");

        // Adding classes
        mySchedule.addCourse(cs101);
        mySchedule.addCourse(math201);
        mySchedule.addCourse(phys101); // Should trigger conflict error
        mySchedule.addCourse(eng102);

        // Displaying final schedule
        mySchedule.displaySchedule();
    }
}