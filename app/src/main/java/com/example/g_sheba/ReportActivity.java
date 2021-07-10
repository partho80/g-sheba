package com.example.g_sheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ReportActivity extends AppCompatActivity {
    private ListView listView;
    private List<Patient> patientList;
    private CustomAdapter customAdapter;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Bundle bundle1 = getIntent().getExtras();
        Bundle bundle2 = getIntent().getExtras();
        String phone = bundle1.getString("phone");
        String date = bundle2.getString("date");
        listView = (ListView) findViewById(R.id.report_list_view_id);
        databaseReference = FirebaseDatabase.getInstance().getReference("Patient").child(phone);
        patientList = new ArrayList<>();
        customAdapter = new CustomAdapter(ReportActivity.this,R.layout.sample_layout,patientList);
    }

    @Override
    protected void onStart() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                patientList.clear();
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren())
                {
                    Patient patient = dataSnapshot1.getValue(Patient.class);
                    patientList.add(patient);
                }
                listView.setAdapter(customAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        super.onStart();
    }
}