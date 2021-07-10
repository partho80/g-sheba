package com.example.g_sheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FindAppointmentActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private ListView listView;
    private List<AppointmentPatient> appointmentPatientList;
    private CustomAdapter1 customAdapter1;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_appointment);
        editText = (EditText) findViewById(R.id.find_appointment_edit_txt1);
        button = (Button) findViewById(R.id.find_appointment_Button1);
        listView = (ListView) findViewById(R.id.find_appointment_list_View);
        databaseReference = FirebaseDatabase.getInstance().getReference("Appointment");
        appointmentPatientList = new ArrayList<>();
        customAdapter1 = new CustomAdapter1(FindAppointmentActivity.this,appointmentPatientList);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = editText.getText().toString().trim();
                if (phone.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Phone No.",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    databaseReference = FirebaseDatabase.getInstance().getReference("Appointment").child(phone);
                    onStart();
                    editText.setText("");
                }
            }
        });

    }

    @Override
    protected void onStart() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                appointmentPatientList.clear();
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren())
                {
                    AppointmentPatient appointmentPatient = dataSnapshot1.getValue(AppointmentPatient.class);
                    appointmentPatientList.add(appointmentPatient);
                }
                listView.setAdapter(customAdapter1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        super.onStart();
    }
}