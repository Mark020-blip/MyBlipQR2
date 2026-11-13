package com.example.bippsqr2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText studentName, studentID, section;
    EditText date, checkInTime, attendanceStatus;
    Button btnSubmitCheckIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendancecheckindata);

        // Connect XML elements
        studentName = findViewById(R.id.StudentName);
        studentID = findViewById(R.id.StudentID);
        section = findViewById(R.id.Section);
        date = findViewById(R.id.Date);
        checkInTime = findViewById(R.id.CheckInTime);
        attendanceStatus = findViewById(R.id.AttendanceStatus);

        btnSubmitCheckIn = findViewById(R.id.btnSubmitCheckIn);

        // Submit Button
        btnSubmitCheckIn.setOnClickListener(v -> {

            String name = studentName.getText().toString().trim();
            String id = studentID.getText().toString().trim();
            String studentSection = section.getText().toString().trim();
            String studentDate = date.getText().toString().trim();
            String time = checkInTime.getText().toString().trim();
            String status = attendanceStatus.getText().toString().trim();

            // Check empty fields
            if (name.isEmpty() || id.isEmpty() ||
                    studentSection.isEmpty() ||
                    studentDate.isEmpty() ||
                    time.isEmpty() ||
                    status.isEmpty()) {

                Toast.makeText(this,
                        "Please complete all fields!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            // Check attendance status
            if (!status.equalsIgnoreCase("Present") &&
                    !status.equalsIgnoreCase("Absent") &&
                    !status.equalsIgnoreCase("Late")) {

                Toast.makeText(this,
                        "Enter Present, Absent, or Late.",
                        Toast.LENGTH_LONG).show();
                return;
            }

            // Successful submission
            Toast.makeText(this,
                    "Attendance submitted successfully for " + name,
                    Toast.LENGTH_LONG).show();
        });
    }
}