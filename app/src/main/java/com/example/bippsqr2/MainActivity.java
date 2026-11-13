package com.example.bippsqr2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etFullName, etStudentID, etSection, etStatus;
    Button btnSubmitLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Display attendanceandstudentlogs.xml
        setContentView(R.layout.attendanceandstudentlogs);

        // Connect XML elements
        etFullName = findViewById(R.id.editTextText15);
        etStudentID = findViewById(R.id.editTextText16);
        etSection = findViewById(R.id.editTextText17);
        etStatus = findViewById(R.id.editTextText18);
        btnSubmitLog = findViewById(R.id.button);

        // Submit Button Click Listener
        btnSubmitLog.setOnClickListener(v -> {
            String name = etFullName.getText().toString().trim();
            String id = etStudentID.getText().toString().trim();
            String section = etSection.getText().toString().trim();
            String status = etStatus.getText().toString().trim();

            if (name.isEmpty() || id.isEmpty() || section.isEmpty() || status.isEmpty()) {
                Toast.makeText(this, "Please complete all fields!", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Log submitted successfully for " + name, Toast.LENGTH_LONG).show();
        });
    }
}
