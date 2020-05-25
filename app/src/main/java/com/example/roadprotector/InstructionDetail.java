package com.example.roadprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionDetail extends AppCompatActivity {
    Button navigateInstruction;
    Button exploreInstruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_detail);

        navigateInstruction = findViewById(R.id.navinstructid);
        exploreInstruction = findViewById(R.id.exploreinstructid);

        navigateInstruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InstructionDetail.this, OnboardingActivity.class);
                intent.putExtra("Activity", "NavigationActivity");
                startActivity(intent);
            }
        });

        exploreInstruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InstructionDetail.this, OnboardingActivity.class);
                intent.putExtra("Activity", "ExploreActivity");
                startActivity(intent);
            }
        });



    }
}
