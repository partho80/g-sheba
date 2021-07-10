package com.example.g_sheba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class result extends AppCompatActivity {
    private EditText editTextResult1,editTextResult2,editTextResult3,editTextResult4,editTextResult5;
    private Button buttonResult1,buttonResult2,buttonResult3;
    private String HealthCondition;
    DatabaseReference databaseReference;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        databaseReference = FirebaseDatabase.getInstance().getReference("Patient");
        editTextResult1 = (EditText) findViewById(R.id.resultEditText1);
        editTextResult2 = (EditText) findViewById(R.id.resultEditText2);
        editTextResult3 = (EditText) findViewById(R.id.resultEditText3);
        editTextResult4 = (EditText) findViewById(R.id.resultEditText4);
        editTextResult5 = (EditText) findViewById(R.id.resultEditText5);
        buttonResult1 = (Button) findViewById(R.id.resultButton1);
        buttonResult2 = (Button) findViewById(R.id.resultButton2);
        buttonResult3 = (Button) findViewById(R.id.resultButton3);
        Bundle bundle = getIntent().getExtras();
        int HealthCheckValue = bundle.getInt("Result");
        if(HealthCheckValue < 18)
        {
            HealthCondition="Good";

        }
        if (HealthCheckValue>17 && HealthCheckValue<25)
        {
            HealthCondition = "Minor";
        }
        if (HealthCheckValue>24 && HealthCheckValue<35)
        {
            HealthCondition = "Not Good";
        }
        if (HealthCheckValue>34)
        {
            HealthCondition = "Serious";
        }
        buttonResult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextResult1.getText().toString().trim();
                String age = editTextResult2.getText().toString().trim();
                String phone = editTextResult3.getText().toString().trim();
                String email = editTextResult4.getText().toString().trim();
                String date = editTextResult5.getText().toString().trim();
                String condition = HealthCondition;
                Patient patient = new Patient(name,age,phone,email,date,condition);
                if(name.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Name",Toast.LENGTH_SHORT).show();
                }
                if(age.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Age",Toast.LENGTH_SHORT).show();
                }
                if(phone.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Phone Number",Toast.LENGTH_SHORT).show();

                }
                if(email.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter email",Toast.LENGTH_SHORT).show();
                }
                if (date.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Date",Toast.LENGTH_SHORT).show();

                }
                else{
                    databaseReference.child(phone).child(date).setValue(patient);
                    Toast.makeText(getApplicationContext(),"Your data has been saved",Toast.LENGTH_SHORT).show();

                }




            }
        });
        buttonResult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextResult1.getText().toString().trim();
                String age = editTextResult2.getText().toString().trim();
                String phone = editTextResult3.getText().toString().trim();
                String email = editTextResult4.getText().toString().trim();
                String date = editTextResult5.getText().toString().trim();
                String condition = HealthCondition;
                if (phone.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Give your phone number to check your report",Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent = new Intent(getApplicationContext(), ReportActivity.class);
                    intent.putExtra("phone", phone);
                    intent.putExtra("date", date);
                    startActivity(intent);
                }



            }
        });
        buttonResult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextResult1.getText().toString().trim();
                String age = editTextResult2.getText().toString().trim();
                String phone = editTextResult3.getText().toString().trim();
                String email = editTextResult4.getText().toString().trim();
                String date = editTextResult5.getText().toString().trim();
                if(name.isEmpty()||age.isEmpty()||phone.isEmpty()||email.isEmpty()||date.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Fil up every information",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (HealthCheckValue < 18) {
                        Intent intent = new Intent(getApplicationContext(), goodCondition.class);
                        startActivity(intent);

                    }
                    if (HealthCheckValue > 17 && HealthCheckValue < 25) {
                        Intent intent = new Intent(getApplicationContext(), minorCondition.class);
                        startActivity(intent);

                    }
                    if (HealthCheckValue > 24 && HealthCheckValue < 35) {
                        Intent intent = new Intent(getApplicationContext(), mediumCondition.class);
                        startActivity(intent);

                    }
                    if (HealthCheckValue > 34) {
                        Intent intent = new Intent(getApplicationContext(), seriousCondition.class);
                        startActivity(intent);

                    }
                    editTextResult1.setText("");
                    editTextResult2.setText("");
                    editTextResult3.setText("");
                    editTextResult4.setText("");
                    editTextResult5.setText("");
                }

            }
        });


    }
}