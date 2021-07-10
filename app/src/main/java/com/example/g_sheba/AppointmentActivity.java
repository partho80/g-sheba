package com.example.g_sheba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AppointmentActivity extends AppCompatActivity {
    private EditText editText1,editText2,editText3,editText4,editText5,editText6;
    private Button buttonSet,buttonDelete;
    private TextView textView;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        textView = (TextView) findViewById(R.id.appoint1);
        Bundle bundle = getIntent().getExtras();
        String Doctor = bundle.getString("Doctor");
        editText1=(EditText) findViewById(R.id.appointment_edit_txt1);
        editText2=(EditText) findViewById(R.id.appointment_edit_txt2);
        editText3=(EditText) findViewById(R.id.appointment_edit_txt3);
        editText4=(EditText) findViewById(R.id.appointment_edit_txt4);
        editText5=(EditText) findViewById(R.id.appointment_edit_txt5);
        editText6=(EditText) findViewById(R.id.appointment_edit_txt6);
        buttonSet = (Button) findViewById(R.id.appointment_Button1);
        buttonDelete = (Button) findViewById(R.id.appointment_Button2);
        databaseReference = FirebaseDatabase.getInstance().getReference("Appointment");
        buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor_name = Doctor;
                String patient_name = editText1.getText().toString().trim();
                String patient_phone = editText2.getText().toString().trim();
                String appointment_date = editText3.getText().toString().trim();
                String appointment_time = editText6.getText().toString().trim();
                AppointmentPatient appointmentPatient = new AppointmentPatient(doctor_name,patient_name,patient_phone,appointment_date,appointment_time);
                if(patient_name.isEmpty()||patient_phone.isEmpty()||appointment_date.isEmpty()||appointment_time.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Fill up every information",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    databaseReference.child(patient_phone).child(appointment_date).setValue(appointmentPatient);
                    Toast.makeText(getApplicationContext(),"Your appointment has been set",Toast.LENGTH_SHORT).show();
                    editText1.setText("");
                    editText2.setText("");
                    editText3.setText("");
                    editText6.setText("");

                }
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String patient_phone = editText4.getText().toString().trim();
                String appointed_date = editText5.getText().toString().trim();
                if(patient_phone.isEmpty()||appointed_date.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Fill up every information",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    databaseReference.child(patient_phone).child(appointed_date).removeValue();
                    Toast.makeText(getApplicationContext(),"Your appointment has been deleted",Toast.LENGTH_SHORT).show();
                    editText4.setText("");
                    editText5.setText("");

                }

            }
        });

        textView.setText("DOCTOR "+Doctor);


    }
}