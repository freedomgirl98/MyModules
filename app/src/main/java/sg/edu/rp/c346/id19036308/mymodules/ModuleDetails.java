package sg.edu.rp.c346.id19036308.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {
    TextView tvMC,tvMN, tvAY,tvSem, tvMCredit, tvVenue;

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvMC = findViewById(R.id.textViewMC);
        tvMN = findViewById(R.id.textViewMN);
        tvAY = findViewById(R.id.textViewAY);
        tvSem = findViewById(R.id.textViewSem);
        tvMCredit = findViewById(R.id.textViewMCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String mc = intentReceived.getStringExtra("ModuleCode");
        String mn = intentReceived.getStringExtra("ModuleName");
        int ay = intentReceived.getIntExtra("AcademicYear", 0);
        int sem = intentReceived.getIntExtra("Semester",0);
        int mCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        tvMC.setText("Module Code: " + mc);
        tvMN.setText("Module Code: " + mn);
        tvAY.setText("Module Code: " + ay);
        tvSem.setText("Module Code: " + sem);
        tvMCredit.setText("Module Code: " + mCredit);
        tvVenue.setText("Module Code: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
