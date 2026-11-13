package BippRoom2_2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BippsRoom2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bipps_room2);

        EditText nameField = findViewById(R.id.editTextText);
        EditText roomField = findViewById(R.id.editTextText6);
        EditText buildingField = findViewById(R.id.editTextText7);
        EditText timeField = findViewById(R.id.editTextText8);

        Button acceptButton = findViewById(R.id.button3);
        acceptButton.setOnClickListener(v -> {
            String name = nameField.getText().toString();
            String room = roomField.getText().toString();
            String building = buildingField.getText().toString();
            String time = timeField.getText().toString();

            Toast.makeText(this, "Accepted: " + name + ", room " + room, Toast.LENGTH_SHORT).show();
        });
    }
}