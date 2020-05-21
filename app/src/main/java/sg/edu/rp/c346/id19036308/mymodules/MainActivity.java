package sg.edu.rp.c346.id19036308.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAP, tvIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAP = findViewById(R.id.textViewAP);
        tvIP = findViewById(R.id.textViewIP);

        tvAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
               intent.putExtra("ModuleCode", "C346");
               intent.putExtra("ModuleName", "Android Programming");
               intent.putExtra("AcademicYear", 2020);
               intent.putExtra("Semester", 1);
               intent.putExtra("ModuleCredit", 4);
               intent.putExtra("Venue", "W66M");
               startActivity(intent);
            }
        });
        tvIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("ModuleCode", "C349");
                intent.putExtra("ModuleName", "iPad Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E63B");
                startActivity(intent);
            }
        });

    }
}
