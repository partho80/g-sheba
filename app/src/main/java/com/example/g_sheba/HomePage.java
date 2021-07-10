package com.example.g_sheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {
    FirebaseAuth mAuth;
    private Button buttonHomePage1, buttonHomePage2 , buttonHomePage3 , buttonHomePage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mAuth = FirebaseAuth.getInstance();
        buttonHomePage1 = (Button) findViewById(R.id.homePageButtonId1);
        buttonHomePage2 = (Button) findViewById(R.id.homePageButtonId2);
        buttonHomePage3 = (Button) findViewById(R.id.homePageButtonId3);
        buttonHomePage4 = (Button) findViewById(R.id.homePageButtonId4);
        buttonHomePage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),G_SHEBA_Tips.class);
                startActivity(intent);

            }
        });
        buttonHomePage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Healthcondition.class);
                startActivity(intent);

            }
        });
        buttonHomePage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FindDoctorActivity.class);
                startActivity(intent);
            }
        });
        buttonHomePage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FindAppointmentActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layoout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        FirebaseAuth.getInstance().signOut();
        finish();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
}